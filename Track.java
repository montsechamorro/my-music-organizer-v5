/**
 * Store the details of a music track,
 * such as the artist, title, and file name.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;
    // veces que se ha reproducido una cancion
    private int playCount;
    // indica el album en que esta contenida la cancion
    private String albumTitle;
    
    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    public Track(String artist, String title, String filename, String albumTitle)
    {
        setDetails(artist, title, filename, albumTitle);
        playCount = 0;
     
    }
    
    /**
     * Constructor for objects of class Track.
     * It is assumed that the file name cannot be
     * decoded to extract artist and title details.
     * @param filename The track file. 
     */
    public Track(String filename, String albumTitle)
    {
        setDetails("unknown", "unknown", filename, albumTitle);
    }
    
    /**
     * Return the artist.
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Return the title.
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the file name.
     * @return The file name.
     */
    public String getFilename()
    {
        return filename;
    }
    /**
     * devuelve el titulo del album donde se encuentra la cancion
     */
    public String getAlbumTitle()
    {
        return albumTitle;
    }
    public void setAlbumTitle(String albumTitle)
    {
        this.albumTitle = albumTitle;
    }
        
    /**
     * Return details of the track: artist, title and file name.
     * @return The track's details.
     */
    public String getDetails()
    {
        return artist + ": " + title + "  (file: " + filename + ")" + "Times played: " + playCount + "Titulo del Album: " + albumTitle;
    }
    
    /**
     * Set details of the track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    private void setDetails(String artist, String title, String filename, String albumTitle)
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
        this.albumTitle = albumTitle;
    }
    /**
     * metodo que devuelve las veces que se ha reproducido la cancion
     */
    public int getPlayCount()
    {
        return playCount;
    }
    /**
     * metodo que resetea el contador
     */
    public void resetPlayCount()
    {
        playCount = 0;
    }
    /**
     * metodo que incrementa el contador
     */
    public void incrementPlayCount()
    {
        playCount++;
    }
    
}
