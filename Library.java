package LibInterface;

// Use SetLib methods to implement methods of LibName and Libbooks
// Each merthos is adding the name passed, concatenates and writes toa file.

public class Library {
    // if not static , cant execute
    public static void main(String args[]) {

        Filewr f2 = new Filewr();
        String librecord="";
        SetLib slib = new SetLib(); // Object to class that implments interfaces.

        librecord = slib.setCollegeName("BDT");
        librecord += slib.setLibName("Manasa");

        librecord += slib.setTitle("Java");
        librecord += slib.setAuthor("Buyya");
        librecord += slib.setYear("2014");
        librecord += slib.setPublisher("McGrahill");
        librecord +=slib.setPrice("2000");


        System.out.println("Content that will be written into target file : \n\n" + librecord);
        f2.writeToFile(librecord, "C:\\Users\\Bharath\\Documents\\libfile.csv");

    }


}


