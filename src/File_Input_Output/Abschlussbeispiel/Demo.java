package File_Input_Output.Abschlussbeispiel;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Demo starting up...");
        Address a = new Address("King", "Kong",
                "+81 316 7", "kong@superking.biz");
        Address b = new Address("Olaf", "Der Schneemann",
                "+43 316 7", "olaf@superking.biz");

        System.out.println("Meine Testadresse: " + a);
        System.out.println("Meine Testadresse: " + a.toString_ZAM());

        AddressManager am = new AddressManager();
        am.add(a);
        am.add(b);

        am.printAllAddresses();
        System.out.println("Testing CSV output...");
        String filepath = "content2.txt";
        try {
            am.exportToCsv(filepath, "❤");
        } catch (AddressExportException e) {
            System.out.println("ERROR: beim Exportieren hat etwas nicht funktioniert.");
            //throw new RuntimeException(e);
        } catch (AddressExportFileAlreadyExistsException e) {
            System.out.println("ERROR: die Datei '" + filepath + "' existiert bereits. Habe Datei nicht geschieben");
            //throw new RuntimeException(e);
        }

        System.out.println("Main wird beendet.");
    }
}
