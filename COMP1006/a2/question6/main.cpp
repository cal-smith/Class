#include <iostream>
#include <sstream>

using namespace std;

struct song{
	string title;
	string artist;
	int year;
};

//little helper function
song* songmaker(string title, string artist, int year){
	song *s = new song;
	s->title = title;
	s->artist = artist;
	s->year = year;
	return s;
}

string songToString(song s){
	stringstream songstring;
	songstring << s.title << " [" << s.artist << "] (" << s.year << ")";
	return songstring.str();
}

song** songsFromYear(song **songs, int size, int year, int *result_size){
	//first loop to get the size of the new array
	*result_size = 0;
	for (int i = 0; i < size; i++){
		if (songs[i]->year == year) {
			(*result_size)++;
		}
	}
	//second loop to filter it down
	song** filtered = new song* [*result_size];
	int count = 0;
	for (int i = 0; i < size; i++){
		if (songs[i]->year == year) {
			filtered[count] = songs[i];
			count++;
		}
	}
	return filtered;
}

int main() {
	int songssize = 5;
    song** songs = new song* [songssize];
    songs[0] = songmaker("Nightbus Sleepers", "dan le sac Vs Scroobius Pip", 2013);
    songs[1] = songmaker("Contact", "Daft Punk", 2013);
    songs[2] = songmaker("Tycho Brahe", "IAYD", 2009);
    songs[3] = songmaker("Download This Song", "Mc Lars", 2006);
    songs[4] = songmaker("Ramble On", "Led Zeppelin", 1969);

    cout << "expecting: Nightbus Sleepers [dan le sac Vs Scroobius Pip] (2013)" << endl;
    cout << "got: " << songToString(*songs[0]) << endl;

    int yearsize2013;//we set result_size to 0, so it's not *nessicary* to initilize it
    int yearsize2009 = 0;//but we can
    song** from2013 = songsFromYear(songs, songssize, 2013,  &yearsize2013);
    song** from2009 = songsFromYear(songs, songssize, 2009,  &yearsize2009);
    cout << endl << "songs from 2013: " << endl
    	 << songToString(*from2013[0]) << ", " << endl
    	 << songToString(*from2013[1]) << endl
    	 << "total songs from 2013: " << yearsize2013 << endl;

   	cout << endl << "songs from 2009: " << endl
    	 << songToString(*from2009[0]) << endl
    	 << "total songs from 2009: " << yearsize2009 << endl;

    //free all the memory!
    //though to be fair, its more or less a formality here
   	//also this loop may or may not be slightly overkill
    for (int i = 0; i < songssize; i++){
    	delete songs[i];
    }
    delete [] songs;
    delete [] from2013;
    delete [] from2009;
    return 0;
}
