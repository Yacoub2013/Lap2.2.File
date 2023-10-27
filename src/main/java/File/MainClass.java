package File;


public class MainClass {
    public static void printALL(File[] files){
        if(files!=null){
            for(File file:files){
                if(file !=null){
                    file.print();
                }
            }
        }
    }

    
    
    public static void main(String[] args) {

        Size size = new Size(1024,3072);
        Duration duration = new Duration(1,05,28);
        Size sizeVideo = new Size(640,352);
        Duration durationVideo = new Duration(1,48,8);

        File[] files=new File[4];
        files[0] = new Document("j110-lab2-hiers",23212,"docx",2);
        files[1] = new Images("spb-map.png",1703527,"image",size);
        files[2] = new Multimedia("06-PrettyGirl.mp3",7893454,"Eric Clapton","Pretty Girl",duration);
        files[3] = new Video("BackToTheFuturel.avi",1470984192,"video","Back to the future I, 1985",sizeVideo,durationVideo);
        printALL(files);




    }
}
/*
public static void main (String[]args){
        Publisher prospeck = new Publisher("Проспект", "Москва");
        Publisher piter = new Publisher("Пиер", "Санкт-Петербург");
        Publisher bhw = new Publisher("БХВ", "Санкт-Петебург");
        Publisher dialectika = new Publisher("Диалектика", "Киев");
1024  3072
 */