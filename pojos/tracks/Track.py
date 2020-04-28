from abc import ABC, abstractmethod
from .Source import TypeSource
class Track(ABC):

    def __init__(self, name, artist):
        self.name=name
        self.artist=artist

    @abstractmethod
    def play(self): pass
    def __eq__(self, other): return self.name==other.name and self.artist==other.artist


class Song(ABC, Track):

    def __init__(self, name, artist):
        super(name, artist)
        self.type=TypeSource.Song

class Podcast(ABC, Track):

    def __init__(self, name, artist):
        super(name, artist)
        self.type=TypeSource.Podcast