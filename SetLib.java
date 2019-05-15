package LibInterface;

// Interface LibBooks extends Interface LibName

public class SetLib implements LibName, LibBooks{


    public String setCollegeName(String s) {
        return ("College name is :" + s + "\n");
    }

    public String setLibName(String s) {
        return ("Library name name is :" + s + "\n");
    }




   public String setTitle(String s) {
        return ("Title name is :" + s + "\n");
    }

    public String setAuthor(String s) {
        return ("Author name is :" + s + "\n");
    }

    public String setYear(String s) {
        return ("Year of the book  is :" + s + "\n");
    }

    public String setPublisher(String s) {
        return ("Publisher name is :" + s + "\n");
    }

    @Override
    public String setPrice(String s) {
        return ("the price of book is :" + s + "\n");
    }
}
