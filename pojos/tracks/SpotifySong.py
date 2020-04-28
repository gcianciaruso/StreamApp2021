from .Track import Song
from .Source import SongSource

class SpotifySong(Song):

    def __init__(self, name, artist):
        super(name, artist)
        self.source=SongSource.Spotify

    def play(self):
        print()