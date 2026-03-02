

public class LivreNonDisponibleException extends RuntimeException {
    public LivreNonDisponibleException() {
        super("Le livre n'est pas disponible dans la bibliothèque.");
    }

}
