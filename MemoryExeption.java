public class MemoryExeption extends OutOfMemoryError {
    public MemoryExeption(String message) {
        super("Память кончилась");
    }
}
