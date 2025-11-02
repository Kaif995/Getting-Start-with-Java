class Song:
    def __init__(self, title, artist):
        self.title = title
        self.artist = artist

# Taking input from user
title = input("Enter song title: ")
artist = input("Enter artist name: ")

song1 = Song(title, artist)
print("Song:", song1.title)
print("Artist:", song1.artist)
