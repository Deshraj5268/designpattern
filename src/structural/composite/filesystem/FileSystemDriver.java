package structural.composite.filesystem;

public class FileSystemDriver {

    public static void main(String[] args) {
        Directory movieDirectory = new Directory("movie");

        FileSystem border = new File("border");
        movieDirectory.add(border);

        Directory comedyMovies = new Directory("comedyMovies");
        FileSystem phirHeraPheri = new File("phirHeraPheri");
        comedyMovies.add(phirHeraPheri);
        movieDirectory.add(comedyMovies);

        movieDirectory.ls();
    }
}
