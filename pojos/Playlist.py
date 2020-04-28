
class Playlist:

    def __init__(self, name):
        self.name=name
        self.tracks=[]
        self.count=0

    def add_track(self, track):
        self.tracks+=[track]

    def remove_track(self, track):
        self.tracks.remove(track)

    def reorder(self, start, end):
        if end<0 or end> len(self.tracks): print('bad index')
        self.tracks.insert(end, self.tracks.pop(self.tracks[start]))