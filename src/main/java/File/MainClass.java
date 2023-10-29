package File;

public class MainClass {
    public static void printALL(File[] files) {
        if (files != null) {
            for (File file : files) {
                if (file != null) {
                    file.print();
                }
            }
        }
    }


    public static void main(String[] args) {


        System.out.format("+---------------------------+------------------+-----------------------------------------------------+%n");
        System.out.format("| File name                 |         Size     |                          Details                    |%n");
        System.out.format("+---------------------------+------------------+-----------------------------------------------------+%n");


        File[] files = new File[4];
        files[0] = new Document("j110-lab2-hiers.docx", 23212, "docx", 2);
        files[1] = new Images("spb-map.png", 1703527, "image", 1024, 3072);
        files[2] = new Multimedia("06-PrettyGirl.mp3", 7893454, "audio", "Eric Clapton Pretty Girl", 1, 05, 28);
        files[3] = new Video("BackToTheFuturel.avi", 1470984192, "video", "Back to the future I, 1985", 640, 352, 1, 48, 8);
        printALL(files);


    }
}
