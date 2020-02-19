# StreamApp
## Goal/Purpose
To allow for the use of multiple music streaming services in conjunction in a seamless interface. 
## Functionality
The beginning minimum desired functionality is to:
1. Create a playlist containing tracks from two different streaming services (Spotify and Soundcloud)
2. Play songs from that playlist consecutively in a seamless fashion

## Program Structure

### Abstract Class Song
SoundcloudSong
SpotifySong
.play() method
### Playlist Class
List of Songs
### Search for song
#### Check God Playlist
Metadata stored on device
#### HTTP request from spotify and soundcloud
Display top results from each (Spotify Default)
### Play Controller
#### 2 queues; 1st is standard Queue, 2nd is a playlist 
Checks if first is empty, otherwise second is used
#### Playing a song
When a song is clicked to be played, gets added to top of queue1 and immediately popped
### God Playlist
Contains all *liked* songs

## Libraries used
Spotify Java/Android Web API
https://github.com/kaaes/spotify-web-api-android
Soundcloud Java/Android Web API
https://github.com/vpaliy/SoundCloud-API