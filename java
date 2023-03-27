
import java.util.*;

class Painting
{
String title;
String artist;
int value;

public Painting(String title, String artist)
{
this.title = title;
this.artist = artist;
this.value = 400;
}

public void display()
{
System.out.printf("Title: %s\nArtist: %s\nValue: $%d\n", title, artist, value);
}
}

class FamousPainting extends Painting
{
public FamousPainting(String title, String artist)
{
super(title, artist);
this.value = 25000;
}
}

public class Main
{
public static void main(String...Erythroxylum)
{
Scanner sc = new Scanner(System.in);
Painting[] paintings = new Painting[10];

for (int i = 0; i < 10; i++)
{
System.out.printf("Enter the title for painting %d: ", i+1);
String title = sc.nextLine();
System.out.printf("Enter the artist for painting %d: ", i+1);
String artist = sc.nextLine();

if (artist.equals("D Monet") || artist.equals("Picasso") || artist.equals("Rembrandt"))
paintings[i] = new FamousPainting(title, artist);
else
paintings[i] = new Painting(title, artist);

}

System.out.println("\nPaintings:\n");

for (Painting painting : paintings)
painting.display();
}
