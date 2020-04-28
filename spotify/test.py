import spotipy
from spotipy.oauth2 import SpotifyClientCredentials
import requests as r
import json
import os
import webbrowser

spotify = spotipy.Spotify(client_credentials_manager=SpotifyClientCredentials())
# artist= 'Moses Sumney'
# track= 'Lonely World'
# track_id = spotify.search(q='artist:' + artist + ' track:' + track, type='track')
# print(track_id['tracks']['items'][0]['id'])

# track_uri='spotify:track:5CQ30WqJwcep0pYcV4AMNc'

# token='BQA-__GPI7T1TQ6i3ACTfaTf4gbouX6Bt1LBJJkQgxkX2kU8EVlmvkBF5OGZ_B8gzd0EO8qhpqODvtIE3xMnpJU4MoktrPJ8X19F4wFqoWFjZk3hTpE7QqT2ESwE4mSQqjBqULhQa8xTstnYbOXyiB81WdklLrWz-_8JU3nd4X0nIzOaZTDLiUJfB6IuWLtmgxRLqXIOx3r1hd5S9knOHAkg5MuSzvo0mcQ9GFa2NEKJB0qMIX5r8ve19S-6RDyHSUYduoaX70oDl0l9jA'
# token='BQDeStN0a-dYiVCLH87Lfhqte0ywSm8ATWc4cvKIg3ZieXCGknIsdkxUmYuqmyhmNzJL8MA-PUuZTOnwkJXpUm8ONZqtiGjMM7gC2JEGyeWxoPSedEixYro9exu0bmh-TGh8H_ehZKrhgM78n5cAx-8e6PsXW5d3StgSBDaATyRlvp1IG43UdxnCovEs4KSkoW67LtahhYQq-_WsbBnRRKfh7eMqio5GfQ_UcVw6tg7DQKcPducip84NeMzqKFldfFKASJG4_yPOZ2JKlQ' \

# header={"Accept": "application/json", "Content-Type": "application/json", "Authorization": "Bearer "+token}
# url='https://api.spotify.com/v1/me/player/devices'
# response = r.request("GET", url, headers=header)
# json_data =json.loads(response.text)
# print(json_data['devices'][0]['id'])
# device_id='13f7a36f018c035b9d6dd7de8469d71e62610e69'
# url='https://api.spotify.com/v1/me/player/play'+'?device_id='+device_id
# data='{\"uris\": [\"spotify:track:5CQ30WqJwcep0pYcV4AMNc\"] }'
# response=r.request("PUT", url, data=data, headers=header)
# print(response)

# need to add environment variable for this to work. forget what it was tho
url = 'https://accounts.spotify.com/authorize?client_id=' + os.environ['SPOTIPY_CLIENT_ID'] + 'response_type=code' + \
      'redirect_uri=https%3A%2F%2Fexample.com%2Fcallback&scope=user-read-private%20user-read-email&state=34fFs29kd09'
response = r.request("GET", url)
print(response.text)
file = open('login.html', 'w')
file.write(response.text)
webbrowser.open('login.html')