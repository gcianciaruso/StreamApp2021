import spotipy
from spotipy.oauth2 import SpotifyClientCredentials
import requests as r
import json
import os
import webbrowser


def get_credentials():
    # need client id and client secret for this
    # set environment variables or pass them in
    # environment variables: SPOTIPY_CLIENT_ID, SPOTIPY_CLIENT_SECRET
    # these are gotten from the 'my dashboard' section on spotify for developers
    spotify = spotipy.Spotify(client_credentials_manager=SpotifyClientCredentials())
    return spotify


def get_device_id(header):
    # this gets the user devices- need to get device id for play
    url = 'https://api.spotify.com/v1/me/player/devices'
    response = r.request("GET", url, headers=header)
    json_data = json.loads(response.text)
    device_id = json_data['devices'][0]['id']
    return device_id


def play_song(header, track_uri, device_id):
    # this plays a song on that device
    # get track uri from spotify song link
    url = 'https://api.spotify.com/v1/me/player/play' + '?device_id=' + device_id
    data = '{\"uris\": [\"' + track_uri + '\"] }'
    response = r.request("PUT", url, data=data, headers=header)
    return response


def login():
    # this is a login page that pops up

    # keep getting this error tho---
    # ERROR for site owner:
    # Invalid domain for site key
    # it also has a recaptcha for some reason? look into this
    # https://formidableforms.com/knowledgebase/recaptcha/

    # this link is what we want to do (i think)
    # https://medium.com/@sedwardscode/creating-a-spotify-app-on-the-spotify-developer-page-16907b5872e8

    url = 'https://accounts.spotify.com/authorize?client_id=' + os.environ['SPOTIPY_CLIENT_ID'] + 'response_type=code' + \
          'redirect_uri=https%3A%2F%2Fexample.com%2Fcallback&scope=user-read-private%20user-read-email&state' \
          '=34fFs29kd09 '
    response = r.request("GET", url)
    print(response.text)
    file = open('login.html', 'w')
    file.write(response.text)
    webbrowser.open('login.html')


# get credentials first
spotipy = get_credentials()

# this is the token for getting user's devices
# https://developer.spotify.com/console/get-users-available-devices/
device_token = 'BQALeWT04abQ3XSfUFZ3v8NyLiF8vTJSCwHGm1iw-xGsik158JqaiLHsVIV78hIzoSU1HnpXoyNJ9ve-' \
               'tt8YMzltOWgaDRA60S0y1CRELXD5cTXVGMqHmxRTELCS1T8u0oSs0bNwjL0oQoICU8KWJfxcM-Z8-ADz5L' \
               'AQNcRqClYN5wOTKXdP3r-YQbvr7-XLzoUgZTs5LZ5mROWu1rK3tCFC_EuHC0mma46V1S_DRfqB31v56zZ4UMps' \
               '01HGq7cBa0GCvXrKBmUQ2DPJwA'
header = {"Accept": "application/json", "Content-Type": "application/json",
          "Authorization": "Bearer " + device_token}
device_id = get_device_id(header)
track_uri = 'spotify:track:68KdZxeBL5tGtpVPgVjgzU'
response = play_song(header, track_uri, device_id)
print(response)

login()
