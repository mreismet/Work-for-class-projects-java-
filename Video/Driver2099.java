package Video;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver2099 {

    public static void main(String[] args)
    {
        boolean bottom = true;
        ArrayList<Media> allMedia = new ArrayList<Media>();
        while(bottom)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("1- Add Image");
            System.out.println("2- Add Music");
            System.out.println("3-Add Video");
            System.out.println("4- Show images");
            System.out.println("5- Show music");
            System.out.println("6-Show videos");
            System.out.println("7- Show images and videos");
            System.out.println("8- Show music and videos");
            System.out.println("9- Exit");
            int choice = input.nextInt();
            if(choice == 1)
            {
                System.out.print("type a name ");
                Scanner input1 = new Scanner(System.in);
                String name = input1.nextLine();
                System.out.print("type a image codec ");
                Scanner input2 = new Scanner(System.in);
                String imagecodec = input2.nextLine();

                allMedia.add(new Image(name,imagecodec));
            }
            else if(choice == 2)
            {
                System.out.print("type a name ");
                Scanner input1 = new Scanner(System.in);
                String name = input1.nextLine();
                System.out.print("type a audio codec ");
                Scanner input2 = new Scanner(System.in);
                String audiocodec = input2.nextLine();

                allMedia.add(new Music(name,audiocodec));
            }
            else if(choice == 3)
            {
                System.out.print("type a name ");
                Scanner input1 = new Scanner(System.in);
                String name = input1.nextLine();
                System.out.print("type a image codec ");
                Scanner input2 = new Scanner(System.in);
                String imagecodec = input2.nextLine();
                System.out.print("type a audio codec ");
                Scanner input3 = new Scanner(System.in);
                String audiocodec = input3.nextLine();
                allMedia.add(new Video(name,imagecodec,audiocodec));
            }
            else if(choice == 4)
            {
                for(int i = 0; i < allMedia.size();i++)
                {
                    if(allMedia.get(i) instanceof Image)
                    {
                        System.out.println(((Image) allMedia.get(i)).getMediaInfo());
                        System.out.println();
                    }
                }
            }
            else if(choice ==5)
            {
                for(int i = 0; i < allMedia.size();i++)
                {
                    if(allMedia.get(i) instanceof Music)
                    {
                        System.out.println(((Music) allMedia.get(i)).getMediaInfo());
                        System.out.println();
                    }
                }
            }
            else if (choice ==6)
            {
                for(int i = 0; i < allMedia.size();i++)
                {
                    if(allMedia.get(i) instanceof Video)
                    {
                        System.out.println(((Video) allMedia.get(i)).getMediaInfo());
                        System.out.println();
                    }
                }
            }
            else if(choice ==7)
            {
                for(int i = 0; i < allMedia.size();i++)
                {
                    if(allMedia.get(i) instanceof Interface1.ImageStandard)
                    {
                        if(allMedia.get(i) instanceof Video)
                        {
                            System.out.println(((Video) allMedia.get(i)).getMediaInfo());
                            System.out.println();
                        }
                        else if(allMedia.get(i) instanceof Image)
                        {
                            System.out.println(((Image) allMedia.get(i)).getMediaInfo());
                            System.out.println();
                        }
                    }
                }
            }
            else if(choice ==8 )
            {
                for(int i = 0; i < allMedia.size();i++)
                {
                    if(allMedia.get(i) instanceof Interface1.IAudioStandard)
                    {
                        if(allMedia.get(i) instanceof Video)
                        {
                            System.out.println(((Video) allMedia.get(i)).getMediaInfo());
                            System.out.println();
                        }
                        else if(allMedia.get(i) instanceof Music)
                        {
                            System.out.println(((Music) allMedia.get(i)).getMediaInfo());
                            System.out.println();
                        }
                    }
                }
            }
            else if(choice == 9)
            {
                System.out.println("Shutting down...");
                bottom = false;
            }
        }
    }
}
