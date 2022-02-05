package behavioral.memento;

public class Test {
    public static void main(String[] args) {
        
        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First set of Data\n");
        System.out.println(fileWriter + "\n\n");

        // save the file
        caretaker.save(fileWriter);

        // now write something else
        fileWriter.write("Second set of Data\n");

        // checking the contents of the file
        System.out.println(fileWriter + "\n\n");

        // undo last changes
        caretaker.undo(fileWriter);

        // checking the contents of the file again
        System.out.println(fileWriter + "\n\n");
    }
}
