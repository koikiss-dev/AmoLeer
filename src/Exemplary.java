import java.util.Scanner;

/**
 * La clase Exemplary representa un ejemplar de un libro.
 */
public class Exemplary {
    private String title, author, synopsis, coverType, dateAdd, languaje, datePub, editorial, genre, description;
    private int nPage;

    /**
     * Constructor de la clase Exemplary.
     *
     * @param title       El título del libro.
     * @param author      El autor del libro.
     * @param synopsis    La sinopsis del libro.
     * @param coverType   El tipo de portada del libro.
     * @param dateAdd     La fecha de adquisición del libro.
     * @param languaje    El idioma del libro.
     * @param datePub     La fecha de publicación del libro.
     * @param editorial   La editorial del libro.
     * @param genre       El género del libro.
     * @param description Una descripción breve del ejemplar.
     * @param nPage       La cantidad de páginas del libro.
     */
    public Exemplary(String title, String author, String synopsis, String coverType, String dateAdd, String languaje, String datePub, String editorial, String genre, String description, int nPage) {
        this.title = title;
        this.author = author;
        this.synopsis = synopsis;
        this.coverType = coverType;
        this.dateAdd = dateAdd;
        this.languaje = languaje;
        this.datePub = datePub;
        this.editorial = editorial;
        this.genre = genre;
        this.description = description;
        this.nPage = nPage;
    }

    public Exemplary() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del libro: ");
        this.title = scanner.nextLine();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del autor: ");
        this.author = scanner.nextLine();
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sinopsis: ");
        this.synopsis = scanner.nextLine();
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estilo de portada: ");
        this.coverType = scanner.nextLine();
    }

    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fecha de adquisicion: ");
        this.dateAdd = scanner.nextLine();
    }

    public String getLanguaje() {
        return languaje;
    }

    public void setLanguaje() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Idioma del libro: ");
        this.languaje = scanner.nextLine();
    }

    public String getDatePub() {
        return datePub;
    }

    public void setDatePub() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fecha de publicacion: ");
        this.datePub = scanner.nextLine();
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Editorial: ");
        this.editorial = scanner.nextLine();
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Genero: ");
        this.genre = scanner.nextLine();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Descripcion: ");
        this.description = scanner.nextLine();
    }

    public int getnPage() {
        return nPage;
    }

    public void setnPage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cantidad de paginas: ");
        this.nPage = scanner.nextInt();
    }

    /**
     * Establece la información del ejemplar llamando a los métodos setters correspondientes.
     */
    public void setInfoExemplary(){
        setAuthor();
        setSynopsis();
        setCoverType();
        setDateAdd();
        setLanguaje();
        setDatePub();
        setEditorial();
        setGenre();
        setDescription();
        setnPage();
    }

    /**
     * Obtiene la información del ejemplar llamando a los métodos getters correspondientes.
     */
    public void getInfoExemplary(){
        getTitle();
        getAuthor();
        getSynopsis();
        getCoverType();
        getDateAdd();
        getLanguaje();
        getDatePub();
        getEditorial();
        getGenre();
        getDescription();
        getnPage();
    }
}
