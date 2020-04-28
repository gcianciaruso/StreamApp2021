from .Track import Song
from .Source import SongSource


class SoundCloudSong(Song):

    def __init__(self, name, artist):
        super(name, artist)
        self.source = SongSource.Soundcloud

    def play(self):
        print()