import java.util.*;
import java.io.*;
public class App_1
{
    Scanner in =new Scanner (System.in);
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(read);
    int rpeat=1;
    int flag=0,flag0=0,flag1=0,flag2=0,flag3=0,flag4=0,flag5=0;
    String more="MORE";
    String down="DOWNLOAD";
    String str="";
    boolean bvar1,bvar2;
    public void main()throws IOException
    {
        System.out.println("");
        System.out.println("                            a       p p p   p p p        s s s  t t t t t   o  o   r r r    e e e e e               ");
        System.out.println("                           a a      p     p p     p     s           t      o    o  r    r   e                          ");
        System.out.println("                          a   a     p     p p     p      s          t     o      o r    r   e                  ");
        System.out.println("                         a     a    p p p   p p p          s s      t     o      o r r r    e e e e                     ");
        System.out.println("                        a a a a a   p       p                 s     t     o      o r    r   e                      ");
        System.out.println("                       a         a  p       p                s      t      o    o  r     r  e            ");
        System.out.println("                      a           a p       p           s s s       t       o  o   r      r e e e e e         ");
        System.out.println("                                                                                        -IT ALL STARTS HERE.......... ");
        System.out.println("");
        System.out.println("                            Welcome to The App Store(It All Starts Here)");
        while(rpeat>0)
        {
            System.out.println("                        Please Enter 1 if you want to download Apps");
            System.out.println("                        Please Enter 2 if you want to download Movies");
            System.out.println("                        Please Enter 3 if you want to download Games");
            System.out.println("                        Please Enter 4 if you want to use Search Button");
            System.out.println("                        Please Enter your choice as 5 if you want to Exit ");
            int choice = in.nextInt();
            switch(choice)
            {
                case 1:
                while(rpeat>0)
                {
                    System.out.println("Under which Category do you want to Check for your App to be Downloaded");
                    System.out.println("1. Top Free");
                    System.out.println("2. Top Paid");
                    System.out.println("3. Trending");
                    System.out.println("4. Categories");
                    System.out.println("5. Back To Home");
                    System.out.println("6. Exit");
                    System.out.println("Please Enter Your Choice:");
                    int choice1 = in.nextInt();
                    switch(choice1)
                    {
                        case 1:
                        while(rpeat>0)
                        {
                            System.out.println("Welcome to the TOP FREE Menu of Apps");
                            System.out.println("Here's the list of Apps:");
                            System.out.println("  App Name:       Rating:");
                            System.out.println("1.Whatsapp      - 4.6 ");
                            System.out.println("2.Facebook Lite - 4.7");
                            System.out.println("3.Instagram     - 4.4 ");
                            System.out.println("4.Shareit       - 4.3");
                            System.out.println("5.Messenger     - 4.5");
                            System.out.println("6.Back ");
                            System.out.println("7.Back To Home");
                            System.out.println("8.Exit");
                            System.out.println("Please Enter Your Choice:");
                            int i=in.nextInt();
                            switch(i)
                            {
                                case 1:
                                System.out.println("WHATSAPP :");
                                System.out.println("Size - 14.18 MB");
                                System.out.println("No. of Downloads - 2 Billion +");
                                System.out.println("Rating - 4.6      +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                System.out.println("Press any other Button and then Enter to Go Back");                                    
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                      Whatsapp                                              ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("WhatsApp Messenger is a FREE messaging app available for Android and other smartphones. WhatsApp uses your phone's");
                                    System.out.println(" Internet connection (4G/3G/2G/EDGE or Wi-Fi, as available) to let you message and call friends and family. Switch from SMS to  ");
                                    System.out.println(" WhatsApp to send and receive messages, calls, photos, videos, documents, and Voice Messages.");
                                    System.out.println(" WHY USE WHATSAPP:");
                                    System.out.println("• NO FEES: WhatsApp uses your phone's Internet connection (4G/3G/2G/EDGE or Wi-Fi, as available) to let you message and call .");
                                    System.out.println("• MULTIMEDIA: Send and receive photos, videos, documents, and Voice Messages.");
                                    System.out.println("• FREE CALLS: Call your friends and family for free with WhatsApp Calling, even if they're in another country.");
                                    System.out.println("• GROUP CHAT: Enjoy group chats with your contacts so you can easily stay in touch with your friends or family ");  
                                    System.out.println("");
                                    System.out.println("Type DOWNLOAD to Download this app");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this App in your Device after 15 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this App in your Device after 15 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 2:
                                System.out.println("FACEBOOK LITE :");
                                System.out.println("Size - 21.07 MB");
                                System.out.println("Total no. of Downloads - 1 Billion +");
                                System.out.println("Rating - 4.7      +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                    Facebook Lite                                         ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("This version of Facebook uses less data and works in all network conditions.");
                                    System.out.println("Facebook Lite:");
                                    System.out.println("• Installs fast – the app is smaller, so it's quick to download and uses less storage space.");
                                    System.out.println("• Loads quickly - it is our fastest app. Upload photos faster and see updates from friends.");
                                    System.out.println("• Uses less data - be more efficient with your mobile data. Save money by using less data.");
                                    System.out.println("• Works on all networks - it is designed for 2G networks and areas with slow or unstable internet connections.");
                                    System.out.println("• Works on most Android phones - you can use it on almost any type of Android phone, new or old.");
                                    System.out.println("For the full Facebook app, install Facebook for Android: http://bit.ly/18exgL6");
                                    System.out.println("Keeping up with friends is faster than ever. Facebook is free and always will be.");
                                    System.out.println("  About Facebook:");
                                    System.out.println("• Message friends and have group conversations");
                                    System.out.println("• Get notifications when friends like and comment on your posts");
                                    System.out.println("• See what friends are up to");
                                    System.out.println("• Share updates and photos");
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this app");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this App in your Device after 23 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this App in your Device after 23 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 3:
                                System.out.println("INSTAGRAM : ");
                                System.out.println("Size - 24.30 MB ");
                                System.out.println("Total no. of Downloads - 1.5 Billion + ");
                                System.out.println("Rating - 4.4      +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                      Instagram                                           ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Instagram is a simple way to capture and share the world's moments. Transform your everyday photos and videos"); 
                                    System.out.println("into works of art and share them with your family and friends."); 
                                    System.out.println("See the world through somebody else's eyes by following not only the people you know, but inspirational"); 
                                    System.out.println("Instagrammers, photographers, athletes, celebrities and fashion icons. Every time you open Instagram, you'll see new photos and "); 
                                    System.out.println("videos from your closest friends, plus breathtaking moments shared by creative people across the globe."); 
                                    System.out.println("Over 400 million people use Instagram to:"); 
                                    System.out.println("* Edit photos and videos with free, custom-designed filters. "); 
                                    System.out.println("* Improve photos with 10 advanced creative tools to change brightness, contrast and saturation "); 
                                    System.out.println("as well as shadows, highlights and perspective."); 
                                    System.out.println("* Find people to follow based on the accounts and photos they already love."); 
                                    System.out.println("* Instantly share photos and videos on Facebook, Twitter, Tumblr and other social networks. "); 
                                    System.out.println("* Connect with Instagrammers all over the world and keep up with their photos and videos. "); 
                                    System.out.println("* Send private photo and video messages directly to friends."); 
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this app");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this App in your Device after 25 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this App in your Device after 25 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 4:
                                System.out.println("SHAREIT : ");
                                System.out.println("Size - 8.08 MB ");
                                System.out.println("Total no. of Downloads - 2 Million + ");
                                System.out.println("Rating - 4.3      +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                       ShareIt                                                  ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("SHAREit, the world's fastest cross-platform file transfer tool.");  
                                    System.out.println("- Share all kinds of files whenever and wherever.");  
                                    System.out.println("- 200 times Bluetooth speed!");  
                                    System.out.println("- No USB! No data usage! No internet needed!");  
                                    System.out.println("- Supports Android, iOS (iPhone/iPad), Windows Phone, Windows, and Mac.");  
                                    System.out.println("- The choice of OVER 400 Million users from 200 countries.");  
                                    System.out.println("- Top 1 downloaded App on Google Play in 15 countries and regions.");  
                                    System.out.println("【Main features】");  
                                    System.out.println("► No network restriction");  
                                    System.out.println("Share files whenever & wherever!");  
                                    System.out.println("► Fastest in the world");  
                                    System.out.println("200 times faster than Bluetooth, the highest speed goes up to 20M/s.");  
                                    System.out.println("► Cross-platform transferring");  
                                    System.out.println("Cross-platform sharing for phones & computers & tablets, Android & iOS & Windows Phone & Windows XP/7/8.");  
                                    System.out.println("► Transfer whatever you have");  
                                    System.out.println("Photos, videos, music, installed apps and any other files.");  
                                    System.out.println("► Simple and Easy");  
                                    System.out.println("Friends can transfer files to each other by entering Portal. So easy to share!");  
                                    System.out.println("► Connect to PC");  
                                    System.out.println("Transfer files between phone and PC");  
                                    System.out.println("View your photos and play music on computers.");  
                                    System.out.println("Control PPT directly with your phone, making your presentation easier!");  
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this app");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this App in your Device after 10 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this App in your Device after 10 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 5:
                                System.out.println("MESSENGER : ");
                                System.out.println("Size - 12.01 MB ");
                                System.out.println("Total no. of Downloads - 1.5 Billion + ");
                                System.out.println("Rating - 4.5      +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                     Messenger                                                 ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Instantly reach the people in your life—for free. Messenger is just like texting, but you don't have to pay for ");  
                                    System.out.println("every message (it works with your data plan).");  
                                    System.out.println("Not just for Facebook friends: Message people in your phone book and just enter a phone number to add a new contact.");  
                                    System.out.println("Group chats: Create groups for the people you message most. Name them, set group photos and keep them all in one place.");  
                                    System.out.println("Photos and videos: Shoot videos and snap selfies or other photos right from the app and send them with one tap.");  
                                    System.out.println("Chat heads: Keep the conversation going while you use other apps.");  
                                    System.out.println("Free calls: Talk as long as you want, even with people in other countries. ");  
                                    System.out.println("(Calls are free over Wi-Fi. Otherwise, standard data charges apply.)");  
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this app");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this App in your Device after 15 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this App in your Device after 15 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 6:
                                flag=1;
                                break;
                                case 7:
                                this.main();
                                break;
                                case 8:
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.exit(0);
                                break;
                                default:
                                System.out.println("Invalid Choice");
                            }
                            if(flag==1)
                                break;
                        }
                        break;
                        case 2:
                        while(rpeat>0)
                        {
                            System.out.println("Welcome to the TOP PAID Menu of Apps");
                            System.out.println("Here's the list of Apps:");
                            System.out.println("  App Name:                Rating:");
                            System.out.println("1.MX Player              - 4.1 ");
                            System.out.println("2.PowerAmp Music Player  - 4.6 ");
                            System.out.println("3.FlightRadar            - 4.6 ");
                            System.out.println("4.Nova Launcher          - 4.7 ");
                            System.out.println("5.Our Groceries Key      - 4.4 ");
                            System.out.println("6.Back ");
                            System.out.println("7.Back To Home");
                            System.out.println("8.Exit");
                            System.out.println("Please Enter Your Choice:");
                            int i=in.nextInt();
                            switch(i)
                            {
                                case 1:
                                System.out.println("MX PLAYER : ");
                                System.out.println("Size - 19.23 MB ");
                                System.out.println("Total no. of Downloads - 100 Thousand + ");
                                System.out.println("Rating - 4.1      +");
                                System.out.println("Cost - 40.00 Rs.");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                     MX Player                                           ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("MX Player - The best way to enjoy your movies."); 
                                    System.out.println("a) HARDWARE ACCELERATION - Hardware acceleration can be applied to more videos with the help of new HW+ decoder."); 
                                    System.out.println("b) MULTI-CORE DECODING - MX Player is the first Android video player which supports multi-core decoding. Test result ");
                                    System.out.println("   proved that dual-core device’s performance is up to 70% better than single-core devices."); 
                                    System.out.println("c) PINCH TO ZOOM, ZOOM AND PAN - Easily zoom in and out by pinching and swiping across the screen.");
                                    System.out.println("   Zoom and Pan is also available by option."); 
                                    System.out.println("d) SUBTITLE GESTURES - Scroll forward/backward to move to next/previous text, Up/down to move text up and down, ");
                                    System.out.println("   Zoom in/out to change text size."); 
                                    System.out.println("e) KIDS LOCK - Keep your kids entertained without having to worry that they can make calls or touch other apps."); 
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this app");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this App in your Device after 21 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this App in your Device after 21 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 2:
                                System.out.println("POWERAMP MUSIC PLAYER : ");
                                System.out.println("Size - 13.13  MB ");
                                System.out.println("Total no. of Downloads - 500  Thousand + ");
                                System.out.println("Rating - 4.6       +");
                                System.out.println("Cost - 89.42  Rs.");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                PowerAmp Music Palyer                                    ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Poweramp is a powerful music player for Android.");
                                    System.out.println("Follow us on twitter @PowerampAPP to get instant updates on app development progress, feature spotlight, theme sharing, ");
                                    System.out.println("take part in giveaways and even chances for free copies of Poweramp.");
                                    System.out.println("Please check Common Questions/Answers below in the description.");
                                    System.out.println("Key Features:");
                                    System.out.println("- plays mp3, mp4/m4a (incl. alac), ogg, wma*, flac, wav, ape, wv, tta, mpc, aiff ");
                                    System.out.println("- 10 band optimized graphical equalizer for all supported formats, presets, custom presets");
                                    System.out.println("- separate powerful Bass and Treble adjustment");
                                    System.out.println("- stereo eXpansion, mono mixing, balance");
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this app");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this App in your Device after 15 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this App in your Device after 15 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 3:
                                System.out.println("FLIGHT RADAR : ");
                                System.out.println("Size - 7.70 MB ");
                                System.out.println("Total no. of Downloads - 200 Thousand + ");
                                System.out.println("Rating - 4.6      +");
                                System.out.println("Cost - 12.00 Rs.");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                   Flight Radar                                          ");
                                    System.out.println("╚══════════════════════════════════════════════════╝");
                                    System.out.println("Turn your phone or tablet into an air traffic radar and see planes around the world move in real-time on a detailed");
                                    System.out.println("map. Or point your Android device at a plane in the sky to find out where it’s going and more. Discover today why ");
                                    System.out.println(" millions are already using Flightradar24 - Flight Tracker.");
                                    System.out.println(" Features that have helped make Flightradar24 - Flight Tracker the #1 selling app in 100+ countries and the #1 ");
                                    System.out.println("Travel app in 140+ countries (United States, France, United Kingdom, Germany and more) include: ");
                                    System.out.println("* Watch planes move in real-time on detailed map");
                                    System.out.println("* Identify planes flying overhead by simply pointing your device at the sky (the augmented reality view requires ");
                                    System.out.println("rear camera, accelerometer & magnetic sensor)");
                                    System.out.println(" * Experience what the pilot of a an aircraft sees in real-time and in 3D");
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this app");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this App in your Device after 11 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this App in your Device after 11 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 4:
                                System.out.println("NOVA LAUNCHER : ");
                                System.out.println("Size - 17.0 MB ");
                                System.out.println("Total no. of Downloads - 1 Million  Thousand + ");
                                System.out.println("Rating - 4.7      +");
                                System.out.println("Cost - 48.60 Rs.");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                   Nova Launcher                                           ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("The highly customizable, performance driven, home screen");
                                    System.out.println("Accept no substitutes! Nova Launcher is the top launcher for modern Android, embracing full Material Design throughout."); 
                                    System.out.println("Nova Launcher replaces your home screen with one you control and can customize. Change icons, layouts, animations and more.");           
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this app");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this App in your Device after 17 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this App in your Device after 17 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 5:
                                System.out.println("OUR GROCERIES KEY : ");
                                System.out.println("Size - 16.90 MB ");
                                System.out.println("Total no. of Downloads - 500 Thousand + ");
                                System.out.println("Rating - 4.4      +");
                                System.out.println("Cost - 150.00 Rs.");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                  Our Groceries Key                                    ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("OurGroceries automatically keeps your family’s grocery list in sync with the latest changes—on");                              
                                    System.out.println("every family member’s phone or web browser.");
                                    System.out.println("Every change to your shared shopping list is visible in seconds. See items being checked off as your partner shops!");
                                    System.out.println("iPhone and web versions also availability");
                                    System.out.println("");
                                    System.out.println("Type DOWNLOAD to Download this app");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this App in your Device after 18 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this App in your Device after 18 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 6:
                                flag0=1;
                                break;
                                case 7:
                                this.main();
                                break;
                                case 8:
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.exit(0);
                                break;
                                default:
                                System.out.println("Invalid Choice");
                            }
                            if(flag0==1)
                                break;
                        }
                        break;
                        case 3:
                        while(rpeat>0)
                        {
                            System.out.println("Welcome to the TRENDING Menu of Apps");
                            System.out.println("Here's the list of Apps:");
                            System.out.println("  App Name:           Rating:");
                            System.out.println("1.Hike Messenger    - 4.5 ");
                            System.out.println("2.Retrica           - 4.6 ");
                            System.out.println("3.DuoLingo          - 4.4 ");
                            System.out.println("4.Hotstar           - 4.6 ");
                            System.out.println("5.Xender            - 4.7 ");
                            System.out.println("6.Back ");
                            System.out.println("7.Back To Home");
                            System.out.println("8.Exit");
                            System.out.println("Please Enter Your Choice:");
                            int i=in.nextInt();
                            switch(i)
                            {
                                case 1:
                                System.out.println("HIKE MESSENGER : ");
                                System.out.println("Size - 21.64 MB ");
                                System.out.println("Total no. of Downloads - 1 Billion + ");
                                System.out.println("Rating -  4.5     +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                   Hike Messenger                                           ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Why do you need hike?");
                                    System.out.println(" ★ HIKE DIRECT: Chat & share files WITHOUT INTERNET and ZERO data charges in classrooms, while travelling, pretty much ");
                                    System.out.println("anywhere within 100 meters of a friend! Just open a chat, go to the 3 Dot menu & tap Hike Direct to see the magic!");
                                    System.out.println("★ HIDDEN MODE: An awesome feature which allows you to hide all your private chats from the world and access them only");
                                    System.out.println(" with a password! Your private conversations are now protected & secure from anyone who takes your phone.");
                                    System.out.println("★ 5000+ FREE STICKERS: Why say you’re angry when you can show it? When words can’t express it, say it with stickers! ");
                                    System.out.println("Share thousands of awesome, hilarious & fun stickers with your friends! With the largest collection of Indian regional"); 
                                    System.out.println("stickers in over 30 regional languages, say more with stickers in your language!");         
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this app");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this App in your Device after 23 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this App in your Device after 23 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 2:
                                System.out.println("RETRICA : ");
                                System.out.println("Size - 12.50 MB ");
                                System.out.println("Total no. of Downloads - 2 Million + ");
                                System.out.println("Rating - 4.6      +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                      Retrica                                        ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("“… if you’re looking for a new photo app that’s loaded with filters, Retrica is the one to download…” - Cnet");
                                    System.out.println(" For a simple but effective app that’s all about special filters, look no further than Retrica - New York Times");
                                    System.out.println(" *Ranked #1 Photography app in 65 countries, including England, Italy, Spain, Argentina and Brazil.");
                                    System.out.println("* Featured on the Google Play 606 times");
                                    System.out.println("Millions photos are taken daily with Retrica all around the world.");
                                    System.out.println("Over 250 million downloads");                                        
                                    System.out.println("");             
                                    System.out.println("Type DOWNLOAD to Download this app");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this App in your Device after 15 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this App in your Device after 15 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 3:
                                System.out.println("DUOLINGO : ");
                                System.out.println("Size - 32.33 MB ");
                                System.out.println("Total no. of Downloads - 1 Million + ");
                                System.out.println("Rating - 4.4      +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                     DuoLingo                                             ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Learn English, Spanish, French, German, Italian, Portuguese, Dutch, Irish, Danish, Swedish, Russian,");
                                    System.out.println("Ukrainian, Esperanto, Polish and Turkish — It’s fast, fun and free.");
                                    System.out.println("Practice speaking, reading, listening and writing. Play a game, answer questions and complete lessons to improve your vocabulary and grammar. ");
                                    System.out.println("Start with basic verbs,phrases, and sentences, and learn new words daily.");

                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this app");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this App in your Device after 33 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this App in your Device after 33 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 4:
                                System.out.println("HOTSTAR : ");
                                System.out.println("Size - 44.23 MB ");
                                System.out.println("Total no. of Downloads - 2 Million + ");
                                System.out.println("Rating - 4.6      +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                       Hotstar                                        ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("The Best App to watch any Serial any Match or any thing else any where..................");     
                                    System.out.println("This is simply Hot Star"); 
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this app");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this App in your Device after 45 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this App in your Device after 45 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 5:
                                System.out.println("XENDER : ");
                                System.out.println("Size - 8.56 MB ");
                                System.out.println("Total no. of Downloads - 500 Thousand + ");
                                System.out.println("Rating - 4.7      +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                          Xender                                    ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Xender the better than best app for your file sharing needs");
                                    System.out.println(" ☆ Share any type of files in any places at any time");
                                    System.out.println(" ☆ Absolutely without mobile data usage ");
                                    System.out.println(" ☆ 200 times Bluetooth transfer speed");
                                    System.out.println(" ☆ Supports Android, IOS, Windows, PC/ Mac cross-platform transferring");
                                    System.out.println(" ☆ No need for USB connection and PC software installation");
                                    System.out.println(" ☆ Over 100 million files transferred daily");
                                    System.out.println(" ☆ Play all music and videos");
                                    System.out.println(" ☆ Wifi file transfer master");

                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this app");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this App in your Device after 15 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this App in your Device after 15 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 6:
                                flag1=1;
                                break;
                                case 7:
                                this.main();
                                break;
                                case 8:
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.exit(0);
                                break;
                                default:
                                System.out.println("Invalid Choice");
                            }
                            if(flag1==1)
                                break;
                        }
                        break;
                        case 4:
                        while(rpeat>0)
                        {
                            System.out.println("Welcome to the CATEGORIES Menu of Apps");
                            System.out.println("Here's your list of Categories:");
                            System.out.println("1.Photo Editing Apps");
                            System.out.println("2.Music Apps");
                            System.out.println("3.Shopping Apps");
                            System.out.println("4.Back ");
                            System.out.println("5.Back To Home");
                            System.out.println("6.Exit");
                            System.out.println("Please Enter Your Choice:");
                            int i=in.nextInt();
                            switch(i)
                            {
                                case 1:
                                while(rpeat>0)
                                {
                                    System.out.println("Welcome to the Menu of Photo Editing Apps");
                                    System.out.println("Here's the list of Apps:");
                                    System.out.println("  App Name:       Rating:");
                                    System.out.println("1.Cady Camera   - 4.6 ");
                                    System.out.println("2.Pixlr         - 4.7");
                                    System.out.println("3.Instagram     - 4.4 ");
                                    System.out.println("4.Retrica       - 4.6");
                                    System.out.println("5.Pic Collage   - 4.5");
                                    System.out.println("6.Back ");
                                    System.out.println("7.Back To Home");
                                    System.out.println("8.Exit");
                                    System.out.println("Please Enter Your Choice:");
                                    i=in.nextInt();
                                    switch(i)
                                    {
                                        case 1:
                                        System.out.println("CANDY CAMERA : ");
                                        System.out.println("Size - 6.76 MB ");
                                        System.out.println("Total no. of Downloads - 500 Thousand + ");
                                        System.out.println("Rating - 4.6      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                    Candy Camera                                         ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Let’s take a selfie!");
                                            System.out.println("With Candy Camera’s beautifying filters and silent mode,");
                                            System.out.println("You can take beautiful selfies anywhere and anytime!");
                                            System.out.println("Don’t miss out on Candy Camera’s amazing filters ");
                                            System.out.println("1,000,000 people taking selfies with Candy Camera every day!");
                                            System.out.println(" Filters for Selfies-");
                                            System.out.println(" A diverse range of filters, designed specifically for selfies –");
                                            System.out.println("Every Candy Camera filter will make your skin look amazing!");
                                            System.out.println("Swipe left and right to change between filters,");
                                            System.out.println("And find the perfect beautifying filter for a selfie!");
                                            System.out.println("Candy Camera’s filters are shown real-time while you take a selfie,");
                                            System.out.println("So you always look and feel beautiful with Candy Camera’s filters!");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this app");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this App in your Device after 10 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this App in your Device after 10 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 2:
                                        System.out.println("PIXLR : ");
                                        System.out.println("Size - 9.75 MB ");
                                        System.out.println("Total no. of Downloads - 1 Million + ");
                                        System.out.println("Rating - 4.7      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Pixlr                                       ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Unlock your creativity with Pixlr - the free photo editor! Capture any moment and make it beautiful");
                                            System.out.println(" with over 2 million combinations of free effects, overlays, and filters. Once you’re done, share your finished work directly");
                                            System.out.println("to Instagram, Facebook, Twitter, or your other favorite social networks!");
                                            System.out.println("Follow Pixlr on Instagram (@pixlr) for tips, tricks, and daily inspiration to make cool photos.");
                                            System.out.println("We have a fun new photo challenge for you every week.");
                                            System.out.println("Pixlr (formerly Pixlr Express) is the right photo editor for everyone: whether you have never edited a picture or are a pro, ");
                                            System.out.println("Pixlr has all the tools and effects you need.");

                                            System.out.println(""); 

                                            System.out.println("Type DOWNLOAD to Download this app");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this App in your Device after 15 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this App in your Device after 15 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 3:
                                        System.out.println("INSTAGRAM : ");
                                        System.out.println("Size - 24.30 MB ");
                                        System.out.println("Total no. of Downloads - 1.5 Billion + ");
                                        System.out.println("Rating - 4.4      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Instagram                                           ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Instagram is a simple way to capture and share the world's moments. Transform your everyday photos and videos"); 
                                            System.out.println("into works of art and share them with your family and friends."); 
                                            System.out.println("See the world through somebody else's eyes by following not only the people you know, but inspirational"); 
                                            System.out.println("Instagrammers, photographers, athletes, celebrities and fashion icons. Every time you open Instagram, you'll see "); 
                                            System.out.println("videos from your closest friends, plus breathtaking moments shared by creative people across the globe."); 
                                            System.out.println("Over 400 million people use Instagram to:"); 
                                            System.out.println("* Edit photos and videos with free, custom-designed filters. "); 
                                            System.out.println("* Improve photos with 10 advanced creative tools to change brightness, contrast and saturation "); 
                                            System.out.println("as well as shadows, highlights and perspective."); 
                                            System.out.println("* Find people to follow based on the accounts and photos they already love."); 
                                            System.out.println("* Instantly share photos and videos on Facebook, Twitter, Tumblr and other social networks. "); 
                                            System.out.println("* Connect with Instagrammers all over the world and keep up with their photos and videos. "); 
                                            System.out.println("* Send private photo and video messages directly to friends."); 
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this app");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this App in your Device after 25 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this App in your Device after 25 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 4:
                                        System.out.println("RETRICA : ");
                                        System.out.println("Size - 12.50 MB ");
                                        System.out.println("Total no. of Downloads - 2 Million + ");
                                        System.out.println("Rating - 4.6      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Retrica                                        ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("  Retrica is a simple photo taking and sharing app with a near infinite combination of live filters,");
                                            System.out.println("  layout, editing, social and secret sharing options. You can shoot the same moment a million ways and share it with the world,");
                                            System.out.println("  that special someone or anyone you want.");
                                            System.out.println(" + Unlimited Possibilities: 100+ real time filters with more than 20 layouts");
                                            System.out.println(" + Live Filters: Preview your photos before you snap.");
                                            System.out.println(" + Vignette: Add the Analog film look to your photo.");
                                            System.out.println(" + Collage: Turn your smartphone into your own photo booth. Grab a friend or two.");
                                            System.out.println(" + Stamp: You can decorate your photo with Retrica Stamp");
                                            System.out.println(" + Timer: Go handsfree and selfie stick free. Just set and pose.");
                                            System.out.println(" + Exposure: Set how much light to let in, just like a DSLR.");
                                            System.out.println(" + Social: Instantly upload to your favorite social media platforms.");
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this app");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this App in your Device after 15 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this App in your Device after 15 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 5:
                                        System.out.println("PIC COLLAGE : ");
                                        System.out.println("Size - 10.40 MB ");
                                        System.out.println("Total no. of Downloads - 1 Million + ");
                                        System.out.println("Rating - 4.5      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                        Pic Collage                                     ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("PicCollage is THE coolest collage-maker in town! Join over 100 million people who use PicCollage ");
                                            System.out.println("to combine photos, Youtube videos, funky fonts, sassy stickers and cute cutouts to create the prettiest collages you'll");
                                            System.out.println(" ever see on a mobile device. We have stickers from Sanrio and LA-based independent designer, Sara M. Lyons. ");
                                            System.out.println("When you're done, you can print your collages and photos as high-quality phone cases, posters, magnets and photo ");
                                            System.out.println("print-outs as gifts for yourself or your loved ones!");     
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this app");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this App in your Device after 16 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this App in your Device after 16 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 6:
                                        flag2=1;
                                        break;
                                        case 7:
                                        this.main();
                                        break;
                                        case 8:
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                        System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.exit(0);
                                        break;
                                        default:
                                        System.out.println("Invalid Choice");
                                    }
                                    if(flag2==1)
                                        break;
                                }
                                break;
                                case 2:
                                while(rpeat>0)
                                {                                   
                                    System.out.println("Welcome to the Menu of Music Apps");
                                    System.out.println("Here's the list of Apps:");
                                    System.out.println("  App Name:       Rating:");
                                    System.out.println("1.Saavn         - 4.4 ");
                                    System.out.println("2.Gaana         - 4.7");
                                    System.out.println("3.Wynk Music    - 4.6 ");
                                    System.out.println("4.Shazam        - 4.7");
                                    System.out.println("5.Hungama       - 4.3");
                                    System.out.println("6.Back ");
                                    System.out.println("7.Back To Home");
                                    System.out.println("8.Exit");
                                    System.out.println("Please Enter Your Choice:");
                                    i=in.nextInt();
                                    switch(i)
                                    {
                                        case 1:
                                        System.out.println("SAAVN : ");
                                        System.out.println("Size - 22.78 MB ");
                                        System.out.println("Total no. of Downloads - 500 Thousand + ");
                                        System.out.println("Rating - 4.4      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                         Saavn                                      ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Saavn is unlimited, free access to all your Bollywood, English, Hindi, and Indian regional songs, ");
                                            System.out.println("music, and radio stations – wherever you go. ");
                                            System.out.println("Find your favorite Bollywood, Hindi and English songs, listen to your favorite Indian and International artists,");
                                            System.out.println("create your own playlists, listen to playlists created by our expert curators, or play online radio from any song ");
                                            System.out.println("or artist. Saavn delivers the perfect music to suit your mood.");
                                            System.out.println("Follow your friends and favorite artists to discover and get notified instantly when new content is available. ");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this app");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this App in your Device after 25 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this App in your Device after 25 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 2:
                                        System.out.println("Gaana : ");
                                        System.out.println("Size - 23.11 MB ");
                                        System.out.println("Total no. of Downloads - 1 Million + ");
                                        System.out.println("Rating - 4.7      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                             Gaana                                ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Gaana is the one-stop solution for all your Music needs. Gaana offers you free, unlimited access to all");
                                            System.out.println("your favorite Songs, Bollywood Music, Regional Music & Radio Mirchi - on your mobile phone, no matter where you are.");
                                            System.out.println("With our plethora of collection from New Songs to Old Classics, you can enjoy millions of Hindi, English*, Tamil,");
                                            System.out.println("Telugu, Marathi, Kannada, Punjabi, Malayalam,Bhojpuri, Rajasthani, Bengali, Assamese & Oriya Songs for free.");

                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this app");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this App in your Device after 24 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this App in your Device after 24 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 3:
                                        System.out.println("WYNK MUSIC : ");
                                        System.out.println("Size - 21.91 MB ");
                                        System.out.println("Total no. of Downloads - 1 Millilon + ");
                                        System.out.println("Rating - 4.6      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Wynk Music                                         ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Wynk is a free music download app for every mood! From Rahman to Rihanna, it has over 2 million songs");
                                            System.out.println("across Indian and International music. Stream and download songs on Wynk Music app and delve into");
                                            System.out.println("its huge music library covering all genres namely Bollywood, Pop, Rock, Bhangra, Devotional, ");
                                            System.out.println("Bhajans, Happy, Sad, Romantic, Party, Chill, Love & Old retro songs. Also, get access to music in");
                                            System.out.println("Regional languages such as Punjabi, Bhojpuri, Rajasthani, Marathi, Bengali, Kannada, Gujarati, Tamil,");
                                            System.out.println("Telugu, Malayalam & all other South Indian languages. Not to miss, Ghazals and the Latest &");
                                            System.out.println("Best of English Music is also there for you");    
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this app");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this App in your Device after 21 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this App in your Device after 21 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 4:
                                        System.out.println("SHAZAM : ");
                                        System.out.println("Size - 15.98 MB ");
                                        System.out.println("Total no. of Downloads - 200 Thousand + ");
                                        System.out.println("Rating - 4.7      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                          Shazam                                    ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Shazam is one of the world’s most popular apps, used by more than 100 million people each month to ");
                                            System.out.println("identify music, get song lyrics, and now to discover the music that artists discover themselves.");
                                            System.out.println("Shazam is an app that feels like magic --Techradar.com");
                                            System.out.println("Identify music instantly and share in the thrill of music discovery with the artists you love.");
                                            System.out.println("See what top artists like Calvin Harris, Pitbull, Meghan Trainor, Avicii, Jason Derulo, Wiz Khalifa and others are Shazaming.");

                                            System.out.println("");  
                                            System.out.println("Type DOWNLOAD to Download this app");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this App in your Device after 15 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this App in your Device after 15 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 5:
                                        System.out.println("HUNGAMA : ");
                                        System.out.println("Size - 18.0 MB ");
                                        System.out.println("Total no. of Downloads - 100 Thousand + ");
                                        System.out.println("Rating - 4.3      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Hungama                                    ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Hungama Music App provides free & unlimited access to Songs, Music Videos & Radio from Bollywood,"); 
                                            System.out.println("Hindi, English, Tamil, Telugu, Punjabi & many other Indian Regional Languages.");
                                            System.out.println("Delve into Hungama's music collection library of 3 million Songs & Videos sweeping across a wide genre of Bollywood, Pop, Rock,");
                                            System.out.println("Bhangra, Devotional, Bhajans, Happy, Sad, Romantic, Party, Love & Old songs & Regional like Punjabi, Bhojpuri, Marathi, Bengali,"); 
                                            System.out.println("Kannada, Gujarati, Tamil, Telugu, Malayalam & other South Indian languages along with Ghazals and the Latest & Best of English Music."); 
                                            System.out.println("What's more - get full-scale access to music from Retro & Old Hindi Movie songs and some of the Hottest Remixes.");                                              
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this app");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this App in your Device after 18 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this App in your Device after 18 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 6:
                                        flag3=1;
                                        break;
                                        case 7:
                                        this.main();
                                        break;
                                        case 8:
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                        System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.exit(0);
                                        break;
                                        default:
                                        System.out.println("Invalid Choice");
                                    }
                                    if(flag3==1)
                                        break;
                                }
                                break;
                                case 3:
                                while(rpeat>0)
                                {
                                    System.out.println("Welcome to the Menu of Shopping Apps");
                                    System.out.println("Here's the list of Apps:");
                                    System.out.println("  App Name:        Rating:");
                                    System.out.println("1.Amazon India   - 4.7 ");
                                    System.out.println("2.Flipkart       - 4.4");
                                    System.out.println("3.Jabong         - 4.2 ");
                                    System.out.println("4.Myntra         - 4.7");
                                    System.out.println("5.Olx            - 4.6");
                                    System.out.println("6.Back ");
                                    System.out.println("7.Back To Home");
                                    System.out.println("8.Exit");
                                    System.out.println("Please Enter Your Choice:");
                                    i=in.nextInt();
                                    switch(i)
                                    {
                                        case 1:
                                        System.out.println("AMAZON INDIA : ");
                                        System.out.println("Size - 14.0 MB ");
                                        System.out.println("Total no. of Downloads - 5 Million + ");
                                        System.out.println("Rating - 4.7      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                    Amazon India                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Shop on-the-go from millions of products across categories with the FREE Amazon Shopping App. ");
                                            System.out.println("The Amazon Shopping App for Android, offers a convenient, fast and secure way to search, browse, ");
                                            System.out.println("read reviews and make purchases quickly and easily, anytime anywhere.");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this app");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this App in your Device after 14 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this App in your Device after 14 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 2:
                                        System.out.println("FLIPKART : ");
                                        System.out.println("Size - 24.70 MB ");
                                        System.out.println("Total no. of Downloads - 5 Million + ");
                                        System.out.println("Rating - 4.4      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Flipkart                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Shop the Online Megastore with the free Flipkart Android app. Choose from the massive selection of original");
                                            System.out.println("of original products in Fashion, Electronics, Books, Mobiles and other categories. Get timely alerts on great ");
                                            System.out.println("deals with substantial discounts, every day!");
                                            System.out.println(" _____________________________________");
                                            System.out.println(" India’s No 1 Online Shopping App");

                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this app");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this App in your Device after 25 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this App in your Device after 25 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 3:
                                        System.out.println("JABONG : ");
                                        System.out.println("Size - 21.50 MB ");
                                        System.out.println("Total no. of Downloads - 500 Thousand + ");
                                        System.out.println("Rating - 4.2      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                           Jabong                                  ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("INDIA’S BEST FASHION SHOPPING APP");
                                            System.out.println("Fashion is a beautiful feeling capable of taking people places. This is why we bring you the Jabong ");
                                            System.out.println("shopping app, which you can take with you wherever you go and get fabulous fashion on-the-go.");
                                            System.out.println("Download the free Jabong app from the Google Play apps store and shop for dresses, shoes, t-shirts,");
                                            System.out.println("watches, bags, sunglasses, jewellery, etc. and avail discounts on brands such as Nike, Adidas, Biba,") ;
                                            System.out.println("W, Catwalk, Titan, Ray Ban, and more. Chosen as India’s most loved online shopping website for the ");
                                            System.out.println("latest fashion, lifestyle and beauty products, now you can experience the same level of satisfaction ");
                                            System.out.println("on your android phone with the Jabong fashion app. Jabong offers fast shipping, cash on delivery and ");
                                            System.out.println("15-days easy returns coupled with exclusive app deals, coupons and offers.");

                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this app");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this App in your Device after 22 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this App in your Device after 22 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 4:
                                        System.out.println("MYNTRA : ");
                                        System.out.println("Size - 16.94 MB ");
                                        System.out.println("Total no. of Downloads - 2 Million + ");
                                        System.out.println("Rating - 4.7      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                        Myntra                                     ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Swipe, select and shop! It’s fashion on the go with the all-new Myntra mobile app.");
                                            System.out.println("Take the world of online shopping with you everywhere you go and get all ");
                                            System.out.println(" your favorite fashion merchandise (Ethnic wear,footwear, accessories, beauty products) by top brands.");
                                            System.out.println(" Browse through 2,50,000+ product styles from 1600+ brands instantly on the Myntra shopping app");

                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this app");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this App in your Device after 17 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this App in your Device after 17 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 5:
                                        System.out.println("OLX : ");
                                        System.out.println("Size - 19.67 MB ");
                                        System.out.println("Total no. of Downloads - 500 Thousand + ");
                                        System.out.println("Rating - 4.6      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                          OLX                                         ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("OLX is a globally recognized and loved! - free classifieds app that lets you buy and sell"); 
                                            System.out.println("second-hand goods locally. We bring to you a beautifully functional app with a crisp interface "); 
                                            System.out.println("that lets you find and make great deals for your lesser-used Cars, Bikes, Mobile Phones, "); 
                                            System.out.println("Electronics, Home & Apparel Fashion, Pets, Baby & Kids Products and more.");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this app");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this App in your Device after 20 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this App in your Device after 20 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 6:
                                        flag4=1;
                                        break;
                                        case 7:
                                        this.main();
                                        break;
                                        case 8:
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                        System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.exit(0);
                                        break;
                                        default:
                                        System.out.println("Invalid Choice");
                                    }
                                    if(flag4==1)
                                        break;
                                }
                                break;
                                case 4:
                                flag5=1;
                                break;
                                case 5:
                                this.main();
                                break;
                                case 6:
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.exit(0);
                                break;
                                default:
                                System.out.println("Invalid Choice");
                            }
                            if(flag5==1)
                                break;
                        }
                        break;
                        case 5:
                        this.main();
                        break;
                        case 6:
                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                        System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                        System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                        System.exit(0);
                        break;
                        default:
                        System.out.println("Invalid Choice!");
                    }
                }
                break;
                case 2:
                while(rpeat>0)
                {
                    System.out.println("Under which Category do you want to Check for your Movie to be Downloaded");
                    System.out.println("1. Top Selling");
                    System.out.println("2. New Releases");
                    System.out.println("3. Categories");
                    System.out.println("4. Back to Home");
                    System.out.println("5. Exit");
                    System.out.println("Please Enter Your Choice:");
                    int choice2 = in.nextInt();
                    switch(choice2)
                    {
                        case 1:
                        while(rpeat>0)
                        {
                            System.out.println("Welcome to the TOP SELLING Menu of Movies");
                            System.out.println("Here's the list of Movies:"); 
                            System.out.println("  Movie Name:            Rating:");
                            System.out.println("1.Furious 7             -4.6   ");
                            System.out.println("2.Jurrasic World        -4.7  ");
                            System.out.println("3.Big Hero 6            -4.8 ");
                            System.out.println("4.Mission Impossible 5  -4.5");
                            System.out.println("5.Drishyam              -4.6");
                            System.out.println("6.Back ");
                            System.out.println("7.Back To Home");
                            System.out.println("8.Exit");
                            System.out.println("Please Enter Your Choice:");
                            int i=in.nextInt();
                            switch(i)
                            {
                                case 1:
                                System.out.println("FURIOUS 7 : ");
                                System.out.println("Size - 2.02 GB ");
                                System.out.println("Total no. of Downloads - 1 Million + ");
                                System.out.println("Rating - 4.6       +");
                                System.out.println("Cost - 120.00  Rs.");
                                System.out.println("Type MORE to Learn More about this Movie ");
                                System.out.println("Type DOWNLOAD to Download this Movie");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                       Furious 7                                     ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Vin Diesel, Paul Walker and Dwayne Johnson lead the returning cast across the globe in their most");
                                    System.out.println("gravity-defying and emotional adventure yet. Targeted by a cold-blooded black-ops assassin with a score");
                                    System.out.println("to settle (Jason Statham), their only hope is to get behind the wheel again and secure an ingenious");
                                    System.out.println(" prototype tracking device. Facing their greatest threat yet in places as far away as Abu Dhabi and");
                                    System.out.println(" as familiar as the Los Angeles streets they call home, the crew must come together once again as");
                                    System.out.println(" a team, and as a family, to protect their own. (Original Title - Furious 7) - 2015 Universal Studios");
                                    System.out.println(" All Rights Reserved.");     
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Movie");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Play this Movie in your Device after  1 hr 22 mins");
                                        System.out.println("Thank you for choosing our Movie");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Play this Movie in your Device after 1 hr 22 mins");
                                    System.out.println("Thank you for choosing our Movie");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 2:
                                System.out.println("JURRASIC WORLD : ");
                                System.out.println("Size - 1.72 GB ");
                                System.out.println("Total no. of Downloads - 1.5  Million + ");
                                System.out.println("Rating - 4.7       +");
                                System.out.println("Cost - 145.00  Rs.");
                                System.out.println("Type MORE to Learn More about this Movie ");
                                System.out.println("Type DOWNLOAD to Download this Movie");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                       Jurrasic World                                 ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Steven Spielberg returns to executive produce the long-awaited next installment of his groundbreaking");
                                    System.out.println("Jurassic Park series, Jurassic World. Colin Trevorrow directs the epic action-adventure based on ");
                                    System.out.println("characters created by Michael Crichton. The screenplay is by Rick Jaffa & Amanda Silver and Trevorrow ");
                                    System.out.println("& Derek Connolly, and the story is by Rick Jaffa & Amanda Silver. Frank Marshall and Patrick Crowley ");
                                    System.out.println("join the team as producers. (Original Title - Jurassic World) - 2015 Universal Studios. All Rights Reserved. ");     
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Movie");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Play this Movie in your Device after 1 hr 07 mins");
                                        System.out.println("Thank you for choosing our Movie");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Play this Movie in your Device after 1 hr 07 mins");
                                    System.out.println("Thank you for choosing our Movie");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 3:
                                System.out.println("BIG HERO 6 : ");
                                System.out.println("Size - 1.17 GB ");
                                System.out.println("Total no. of Downloads - 5 Million + ");
                                System.out.println("Rating - 4.8       +");
                                System.out.println("Cost - 100.00  Rs.");
                                System.out.println("Type MORE to Learn More about this Movie ");
                                System.out.println("Type DOWNLOAD to Download this Movie");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                       Big Hero 6                                ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("With all the heart and humor audiences expect from Walt Disney Animation Studios, Big Hero 6");
                                    System.out.println("is an action-packed comedy adventure that introduces Baymax, a lovable personal companion robot who ");
                                    System.out.println("forms a special bond with robotics prodigy Hiro Hamada. When a devastating turn of events catapults");
                                    System.out.println("them into the midst of a dangerous plot unfolding in the streets of San Fransokyo, Hiro turns to"); 
                                    System.out.println("Baymax and his diverse group of friends — adrenaline junkie Go Go Tomago, neatnik Wasabi, ");
                                    System.out.println("chemistry whiz Honey Lemon and fanboy Fred — who transform into a band of unlikely heroes");     
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Movie");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Play this Movie in your Device after 58 mins");
                                        System.out.println("Thank you for choosing our Movie");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Play this Movie in your Device after 58 mins");
                                    System.out.println("Thank you for choosing our Movie");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 4:
                                System.out.println("MISSION IMPOSSIBLE 5 : ");
                                System.out.println("Size - 1.45 GB ");
                                System.out.println("Total no. of Downloads - 2 Million + ");
                                System.out.println("Rating - 4.6       +");
                                System.out.println("Cost - 135.50  Rs.");
                                System.out.println("Type MORE to Learn More about this Movie ");
                                System.out.println("Type DOWNLOAD to Download this Movie");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                   Mission Impossible 5                             ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Loaded with heart-pounding action and jaw-dropping stunts, prepare for the best Mission ever.");
                                    System.out.println("With his elite organization shut down by the CIA, agent Ethan Hunt (Tom Cruise) and his team ");
                                    System.out.println("(Jeremy Renner, Simon Pegg, Ving Rhames) race against time to stop the rise of a new global threat,");
                                    System.out.println("The Syndicate, a dangerous network of rogue operatives turned traitors. To stop them, Ethan must");
                                    System.out.println("join forces with an elusive, disavowed agent (Rebecca Ferguson) who may or may not be on his side ");
                                    System.out.println("as he faces his most impossible mission yet. ");     
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Movie");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Play this Movie in your Device after 1hr 05 mins");
                                        System.out.println("Thank you for choosing our Movie");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Play this Movie in your Device after 1hr 05 mins");
                                    System.out.println("Thank you for choosing our Movie");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 5:
                                System.out.println("DRISHYAM : ");
                                System.out.println("Size - 1.01  GB ");
                                System.out.println("Total no. of Downloads - 500 Thousand + ");
                                System.out.println("Rating - 4.6       +");
                                System.out.println("Cost - 90.00  Rs.");
                                System.out.println("Type MORE to Learn More about this Movie ");
                                System.out.println("Type DOWNLOAD to Download this Movie");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                          Drishyam                                ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Vijay Salgaonkar runs a cable TV network in a remote village of Goa. He lives a happy life with");
                                    System.out.println("his wife Nandini and two daughters. A 4th grade dropout & an orphan, Vijay has worked his way towards");
                                    System.out.println("success with his sheer hard-work & street smartness in order to provide for his family. His wife, ");
                                    System.out.println("while she loves him devoutly, wants Vijay's thrifty & miserly behavior to end. If there's one thing");
                                    System.out.println("that Vijay cannot live without, it is his passion for watching films. Such is his 'filmy' obsession");
                                    System.out.println("that he doesn't mind staying up all night at his office binging on TV movies! In a bizarre turn of");
                                    System.out.println("events; a teenage boy goes missing; he is the son of a headstrong & no-nonsense cop; IG Meera Deshmukh");
                                    System.out.println("and the Salgaonkar family is the prime suspect! Will a humble & middle class man, be able to protect");
                                    System.out.println("his family from oppression of the powerful? How the family weathers the storm that ensues during the");
                                    System.out.println("violent investigation forms the rest of the story leading to an unexpected & shocking climax. ");     
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Movie");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Play this Movie in your Device after 59 mins");
                                        System.out.println("Thank you for choosing our Movie");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Play this Movie in your Device after 59 mins");
                                    System.out.println("Thank you for choosing our Movie");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 6:
                                flag=1;
                                break;
                                case 7:
                                this.main();
                                break;
                                case 8:
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.exit(0);
                                break;
                                default:
                                System.out.println("Invalid Choice"); 
                            }
                            if(flag==1)
                                break;
                        }
                        break;
                        case 2:
                        while(rpeat>0)
                        {
                            System.out.println("Welcome to the NEW RELEASES Menu of Movies");
                            System.out.println("Here's the list of Movies:"); 
                            System.out.println("  Movie Name:            Rating:");
                            System.out.println("1.Fan                   -4.7");
                            System.out.println("2.Batman vs Superman    -4.4");
                            System.out.println("3.Kapoor and Sons       -4.5");
                            System.out.println("4.KingsMan              -4.2");
                            System.out.println("5.Civil War             -4.7");
                            System.out.println("6.Back ");
                            System.out.println("7.Back To Home");
                            System.out.println("8.Exit");
                            System.out.println("Please Enter Your Choice:");
                            int i=in.nextInt();
                            switch(i)
                            {
                                case 1:
                                System.out.println("FAN : ");
                                System.out.println("Size - 1.34 GB ");
                                System.out.println("Total no. of Downloads - 1 Million + ");
                                System.out.println("Rating - 4.7       +");
                                System.out.println("Cost - 140.00  Rs.");
                                System.out.println("Type MORE to Learn More about this Movie ");
                                System.out.println("Type DOWNLOAD to Download this Movie");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                            Fan                           ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("A man (Shah Rukh Khan) develops a dangerous obsession with a movie star who looks just like him.");     
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Movie");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Play this Movie in your Device after 1 hr 03 mins");
                                        System.out.println("Thank you for choosing our Movie");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Play this Movie in your Device after 1 hr 03 mins");
                                    System.out.println("Thank you for choosing our Movie");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 2:
                                System.out.println("BATMAN VS SUPERMAN : ");
                                System.out.println("Size - 1.98 GB ");
                                System.out.println("Total no. of Downloads - 2  Million + ");
                                System.out.println("Rating - 4.4       +");
                                System.out.println("Cost - 178.00  Rs.");
                                System.out.println("Type MORE to Learn More about this Movie ");
                                System.out.println("Type DOWNLOAD to Download this Movie");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                          Batman vs Superman                             ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("From director Zack Snyder comes “Batman v Superman: Dawn of Justice,” starring Ben Affleck as");
                                    System.out.println(" Batman/Bruce Wayne and Henry Cavill as Superman/Clark Kent in the characters’ first big-screen pairing. Fearing");
                                    System.out.println(" the actions of a god-like Super Hero left unchecked, Gotham City’s own formidable, forceful vigilante takes ");
                                    System.out.println("on Metropolis’s most revered, modern-day savior, while the world wrestles with what sort of hero it really");
                                    System.out.println("needs. And with Batman and Superman at war with one another, a new threat quickly arises, putting mankind");
                                    System.out.println(" in greater danger than it’s ever known before.");     
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Movie");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Play this Movie in your Device after 1 hr 39 mins");
                                        System.out.println("Thank you for choosing our Movie");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Play this Movie in your Device after 1 hr 39 mins");
                                    System.out.println("Thank you for choosing our Movie");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 3:
                                System.out.println("KAPOOR AND SONS : ");
                                System.out.println("Size - 1.19 GB ");
                                System.out.println("Total no. of Downloads - 200  Thousand + ");
                                System.out.println("Rating - 4.5       +");
                                System.out.println("Cost - 132.00  Rs.");
                                System.out.println("Type MORE to Learn More about this Movie ");
                                System.out.println("Type DOWNLOAD to Download this Movie");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                    Kapoor And Sons                                   ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("A man (Sidharth Malhotra) and his brother (Fawad Khan) fall for the same woman (Alia Bhatt)");  
                                    System.out.println("while visiting their parents and grandfather in Coonoor, India");     
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Movie");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Play this Movie in your Device after 1 hr 12 mins");
                                        System.out.println("Thank you for choosing our Movie");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Play this Movie in your Device after 1 hr 12 mins");
                                    System.out.println("Thank you for choosing our Movie");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 4:
                                System.out.println("KINGSMAN : ");
                                System.out.println("Size - 1.66 GB ");
                                System.out.println("Total no. of Downloads - 500  Thousand + ");
                                System.out.println("Rating - 4.2       +");
                                System.out.println("Cost - 80.00 Rs.");
                                System.out.println("Type MORE to Learn More about this Movie ");
                                System.out.println("Type DOWNLOAD to Download this Movie");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                       KingsMan                                ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("A suave agent from a secret intelligence organization tries to stop a megalomaniacal tech billionaire's");
                                    System.out.println("evil plot to end climate change through mass murder while the agent's lower class protege struggles to win a ");
                                    System.out.println("spot in the organization in a tough training program. ");     
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Movie");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Play this Movie in your Device after  mins");
                                        System.out.println("Thank you for choosing our Movie");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Play this Movie in your Device after  mins");
                                    System.out.println("Thank you for choosing our Movie");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 5:
                                System.out.println("CIVIL WAR : ");
                                System.out.println("Size - 1.81 GB ");
                                System.out.println("Total no. of Downloads - 1 Million + ");
                                System.out.println("Rating - 4.7       +");
                                System.out.println("Cost - 167.00 Rs.");
                                System.out.println("Type MORE to Learn More about this Movie ");
                                System.out.println("Type DOWNLOAD to Download this Movie");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                      Civil War                                 ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Political pressure mounts to install a system of accountability when the actions of the Avengers lead ");
                                    System.out.println("to collateral damage. The new status quo deeply divides members of the team. Captain America ");
                                    System.out.println("(Chris Evans) believes superheroes should remain free to defend humanity without government ");
                                    System.out.println(" interference. Iron Man (Robert Downey Jr.) sharply disagrees and supports oversight. As the ");
                                    System.out.println("debate escalates into an all-out feud, Black Widow (Scarlett Johansson) and"); 
                                    System.out.println(" Hawkeye (Jeremy Renner) must pick a side.");     
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Movie");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Play this Movie in your Device after 1 hr 40 mins");
                                        System.out.println("Thank you for choosing our Movie");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Play this Movie in your Device after 1 hr 40 mins");
                                    System.out.println("Thank you for choosing our Movie");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 6:
                                flag0=1;
                                break;
                                case 7:
                                this.main();
                                break;
                                case 8:
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.exit(0);
                                break;
                                default:
                                System.out.println("Invalid Choice"); 
                            }
                            if(flag0==1)
                                break;
                        }
                        break;
                        case 3:
                        while(rpeat>0)
                        {
                            System.out.println("Welcome to the CATEGORIES Menu of Movies");
                            System.out.println("Here's your list of Categories:");
                            System.out.println("1.Comedy");
                            System.out.println("2.Thriller");
                            System.out.println("3.Sci-Fi");
                            System.out.println("4.Back ");
                            System.out.println("5.Back To Home");
                            System.out.println("6.Exit");
                            System.out.println("Please Enter Your Choice:");
                            int i=in.nextInt();
                            switch(i)
                            {
                                case 1:
                                while(rpeat>0)
                                {
                                    System.out.println("Welcome to the Menu of Comedy Movies");
                                    System.out.println("Here's the list of Movies:");
                                    System.out.println("  Movie Name:         Rating:");
                                    System.out.println("1.Bombay to Goa     - 4.6 ");
                                    System.out.println("2.Dhammal           - 4.7");
                                    System.out.println("3.Bangistan         - 4.4 ");
                                    System.out.println("4.Welcome Back      - 4.6");
                                    System.out.println("5.Welcome 2 Karachi - 4.5");
                                    System.out.println("6.Back ");
                                    System.out.println("7.Back To Home");
                                    System.out.println("8.Exit");
                                    System.out.println("Please Enter Your Choice:");
                                    i=in.nextInt();

                                    switch(i)
                                    {
                                        case 1:
                                        System.out.println("BOMBAY TO GOA : ");
                                        System.out.println("Size - 1.91 GB ");
                                        System.out.println("Total no. of Downloads - 1 Million + ");
                                        System.out.println("Rating - 4.6       +");
                                        System.out.println("Cost - 67.00 Rs.");
                                        System.out.println("Type MORE to Learn More about this Movie ");
                                        System.out.println("Type DOWNLOAD to Download this Movie");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                     Bombay to Goa                                 ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("The film revolves around two people. Lal is an ambitious guy who wants to start his own");
                                            System.out.println(" business and make it big in life. Das is a loudmouth, and a very arrogant person. ");
                                            System.out.println("The two manage to get hold of 5000 rupees and they open a vada pav centre. As luck would ");
                                            System.out.println("have it, Lal wins Rs. 2 lakhs in a contest. The duo plan to start a travel agency."); 
                                            System.out.println(" Since they do not have enough money to buy a vehicle, they use spare parts of old cars");
                                            System.out.println("to create a bus. Trusting Das to come up with a good make of a bus, he blindly hands ");
                                            System.out.println("over the prize money to him. Lal manages to get passengers for their first ride. ");
                                            System.out.println(" But when the bus comes all hell breaks loose with people demanding their money back.");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Movie");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Play this Movie in your Device after 1 hr 42 mins");
                                                System.out.println("Thank you for choosing our Movie");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Play this Movie in your Device after 1 hr 42 mins");
                                            System.out.println("Thank you for choosing our Movie");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 2:
                                        System.out.println("DHAMMAL : ");
                                        System.out.println("Size - 1.00 GB ");
                                        System.out.println("Total no. of Downloads - 2 Million + ");
                                        System.out.println("Rating - 4.7       +");
                                        System.out.println("Cost - 40.00 Rs.");
                                        System.out.println("Type MORE to Learn More about this Movie ");
                                        System.out.println("Type DOWNLOAD to Download this Movie");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                     Dhammal                                 ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Dhamaal is a fun filled caper about four friends - Roy (Riteish Deshmukh), Manav (Javed Jaafrey),");
                                            System.out.println("Aditya (Arshad Warsi) and Boman (Ashish Chowdhry). One day while trying to save a dying man, ");
                                            System.out.println("they find out about hidden treasure. However, one misadventure follows after another. All ");
                                            System.out.println("four are thrown into hilarious life threatening situations that has the audience in side"); 
                                            System.out.println(" splitting laughter and guessing - Is there really any hidden treasure?");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Movie");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Play this Movie in your Device after 1 hr ");
                                                System.out.println("Thank you for choosing our Movie");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Play this Movie in your Device after 1 hr ");
                                            System.out.println("Thank you for choosing our Movie");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 3:
                                        System.out.println("BANGISTAN : ");
                                        System.out.println("Size - 0.99 GB ");
                                        System.out.println("Total no. of Downloads - 500 Thousand + ");
                                        System.out.println("Rating - 4.4       +");
                                        System.out.println("Cost - 34.00 Rs.");
                                        System.out.println("Type MORE to Learn More about this Movie ");
                                        System.out.println("Type DOWNLOAD to Download this Movie");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                         Bangistan                                 ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Bangistan is a whip smart and uproarious satire on fundamentalism and the story of two unlikely terrorists,");
                                            System.out.println("the antitheses of each other, with a common destructive goal. Concerned by the unrest in ");
                                            System.out.println("the name of religion, Subcontinental leaders of Muslims and Hindus, the Imam and the");
                                            System.out.println("Shankaracharya, announce that they're attending the International Peace Conference in Krakow");
                                            System.out.println("in a joint effort to help unite the two religions in perpetual harmony. Rival rabble-rousing ");
                                            System.out.println("ragtag organizations, the Islamist Al-Kaam Tamam and extreme Hindu right-wing Maa Ka Dal ");
                                            System.out.println("separately recruit and brainwash Hafeez and Praveen to suicide bomb the conference so that");
                                            System.out.println("they may continue to wield their local influence. ");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Movie");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Play this Movie in your Device after 1 hr ");
                                                System.out.println("Thank you for choosing our Movie");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Play this Movie in your Device after 1 hr ");
                                            System.out.println("Thank you for choosing our Movie");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 4:
                                        System.out.println("WELCOME BACK : ");
                                        System.out.println("Size - 1.05 GB ");
                                        System.out.println("Total no. of Downloads - 1 Million + ");
                                        System.out.println("Rating - 4.6       +");
                                        System.out.println("Cost - 93.00 Rs.");
                                        System.out.println("Type MORE to Learn More about this Movie ");
                                        System.out.println("Type DOWNLOAD to Download this Movie");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Welcome Back                                ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Uday and Manju leave the criminal underworld to become businessmen. ");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Movie");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Play this Movie in your Device after 1 hr 05 mins");
                                                System.out.println("Thank you for choosing our Movie");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Play this Movie in your Device after 1 hr 05 mins");
                                            System.out.println("Thank you for choosing our Movie");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 5:
                                        System.out.println("WELCOME 2 KARACHI : ");
                                        System.out.println("Size - 1.49 GB ");
                                        System.out.println("Total no. of Downloads - 200 Thousand + ");
                                        System.out.println("Rating - 4.5       +");
                                        System.out.println("Cost - 43.00 Rs.");
                                        System.out.println("Type MORE to Learn More about this Movie ");
                                        System.out.println("Type DOWNLOAD to Download this Movie");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                   Welcome 2 Karachi                                ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Story kicks off with two dumb and dumber friends, Shami (Arshad Warsi) a court martialed ");
                                            System.out.println("navy officer and Kedar (Jackky Bhagnani) a Gujarati who has been denied American visa multiple times.");
                                            System.out.println("Both plans to sail to USA using a boat but with a twist of fate, end up on the beach of ");
                                            System.out.println("Karachi, Pakistan. On realizing the truth they both try to escape, while being chased by");
                                            System.out.println("an ISI Agent (Lauren Gottlieb). Both get kidnapped by a local don Azher Baluch, ");
                                            System.out.println("who demands ransom from Kedar's father and later releases them in a pathan colony to");
                                            System.out.println("collect fake passports. But Shami, messes up with a bunch of pathans over an ");
                                            System.out.println("India-Pakistan match. In struggle to escape from pathans both meets a talibani militant,");
                                            System.out.println("who takes them to a Taliban camp where they are misunderstood as Talibani militants.");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Movie");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Play this Movie in your Device after 1 hr 23 mins");
                                                System.out.println("Thank you for choosing our Movie");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Play this Movie in your Device after 1 hr 23 mins");
                                            System.out.println("Thank you for choosing our Movie");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 6:
                                        flag1=1;
                                        break;
                                        case 7:
                                        this.main();
                                        break;
                                        case 8:
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                        System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.exit(0);
                                        break;
                                        default:
                                        System.out.println("Invalid Choice"); 
                                    }
                                    if(flag1==1)
                                        break;
                                }
                                break;
                                case 2:
                                while(rpeat>0)
                                {
                                    System.out.println("Welcome to the Menu of Thriller Movies");
                                    System.out.println("Here's the list of Movies:");
                                    System.out.println("  Movie Name:       Rating:");
                                    System.out.println("1.Pizza           - 4.4 ");
                                    System.out.println("2.13 B            - 4.5");
                                    System.out.println("3.The Exorcist    - 4.6 ");
                                    System.out.println("4.Annabelle       - 4.6");
                                    System.out.println("5.The Conjuring   - 4.7");
                                    System.out.println("6.Back ");
                                    System.out.println("7.Back To Home");
                                    System.out.println("8.Exit");
                                    System.out.println("Please Enter Your Choice:");
                                    i=in.nextInt();
                                    switch(i)
                                    {
                                        case 1:
                                        System.out.println("PIZZA : ");
                                        System.out.println("Size - 0.78 GB ");
                                        System.out.println("Total no. of Downloads - 100 Thousand + ");
                                        System.out.println("Rating - 4.4       +");
                                        System.out.println("Cost - 20.00 Rs.");
                                        System.out.println("Type MORE to Learn More about this Movie ");
                                        System.out.println("Type DOWNLOAD to Download this Movie");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                        Pizza                                ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Michael (Vijay Sethupathy) is a pizza delivery boy, who lives with Anu (Ramya Nambeesan). ");
                                            System.out.println("The latter has a passion to pen a story on spirits and ghosts. In the meantime, ");
                                            System.out.println("unexpected pregnancy of Anu forces Michael to marry her. When things go smooth, ");
                                            System.out.println("Michael's life takes a turn when he goes to deliver pizza at a posh bungalow. There he");
                                            System.out.println("gets struck in the house & comes across creepy moments. The rest is all but a chain of");
                                            System.out.println("events that leads to an unexpected climax.");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Movie");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Play this Movie in your Device after 47 mins");
                                                System.out.println("Thank you for choosing our Movie");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Play this Movie in your Device after 47 mins");
                                            System.out.println("Thank you for choosing our Movie");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 2:
                                        System.out.println("13 B : ");
                                        System.out.println("Size - 0.89 GB ");
                                        System.out.println("Total no. of Downloads - 200 Thousand + ");
                                        System.out.println("Rating - 4.5       +");
                                        System.out.println("Cost - 54.00 Rs.");
                                        System.out.println("Type MORE to Learn More about this Movie ");
                                        System.out.println("Type DOWNLOAD to Download this Movie");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                           13 B                       ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Manohar, an upper-middle class Indian, moves into a new apartment - 13B on the ");
                                            System.out.println("13th floor - with his family, fulfilling one of his life's biggest dreams. But the family ");
                                            System.out.println("is greeted by a series of small trivial incidents such as milk getting spoiled that could ");
                                            System.out.println("be regarded as inauspicious but are shrugged off by the excited Manohar. The lift in"); 
                                            System.out.println("the apartment does not operate for Manohar.");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Movie");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Play this Movie in your Device after 53 mins");
                                                System.out.println("Thank you for choosing our Movie");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Play this Movie in your Device after 53 mins");
                                            System.out.println("Thank you for choosing our Movie");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 3:
                                        System.out.println("THE EXORCIST : ");
                                        System.out.println("Size - 1.89 GB ");
                                        System.out.println("Total no. of Downloads - 500 Thousand + ");
                                        System.out.println("Rating - 4.6       +");
                                        System.out.println("Cost - 114.00 Rs.");
                                        System.out.println("Type MORE to Learn More about this Movie ");
                                        System.out.println("Type DOWNLOAD to Download this Movie");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      The Exorcist                       ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Novelist William Peter Blatty based his best-seller on the last known Catholic-sanctioned");
                                            System.out.println("exorcism in the United States. Blatty transformed the little boy in the ");
                                            System.out.println("1949 incident into a little girl named Regan, played by 14-year-old Linda Blair."); 
                                            System.out.println("Suddenly prone to fits and bizarre behavior, Regan proves quite a handful for her ");
                                            System.out.println("actress-mother, Chris MacNeil (played by Ellen Burstyn, although Blatty reportedly based");
                                            System.out.println("the character on his next-door neighbor Shirley MacLaine). When Regan gets completely ");
                                            System.out.println("out of hand, Chris calls in young priest Father Karras (Jason Miller), who becomes");
                                            System.out.println("convinced that the girl is possessed by the Devil and that they must call in an ");
                                            System.out.println("exorcist: namely, Father Merrin (Max von Sydow). ");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Movie");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Play this Movie in your Device after 1 hr 42 mins");
                                                System.out.println("Thank you for choosing our Movie");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Play this Movie in your Device after 1hr 42 mins");
                                            System.out.println("Thank you for choosing our Movie");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 4:
                                        System.out.println("ANNABELLE : ");
                                        System.out.println("Size - 1.71 GB ");
                                        System.out.println("Total no. of Downloads - 500 Thousand + ");
                                        System.out.println("Rating - 4.6       +");
                                        System.out.println("Cost - 191.00 Rs.");
                                        System.out.println("Type MORE to Learn More about this Movie ");
                                        System.out.println("Type DOWNLOAD to Download this Movie");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                         Annabelle                                ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Based on the terrifying doll from The Conjuring. John Form has found the perfect gift for ");
                                            System.out.println("his expectant wife, Mia—a beautiful, rare vintage doll in a pure white wedding dress. But Mia’s");
                                            System.out.println("delight with Annabelle doesn’t last long. On one horrific night, their home is invaded by ");
                                            System.out.println("members of a satanic cult, who violently attack the couple. Spilled blood and terror are ");
                                            System.out.println("not all they leave behind. The cultists have conjured an entity so malevolent that nothing");
                                            System.out.println("they did will compare to the sinister conduit to the damned that is now...Annabelle.");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Movie");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Play this Movie in your Device after 1 hr 35 mins");
                                                System.out.println("Thank you for choosing our Movie");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Play this Movie in your Device after 1 hr 35 mins");
                                            System.out.println("Thank you for choosing our Movie");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 5:
                                        System.out.println("THE CONJURING : ");
                                        System.out.println("Size - 2.45 GB ");
                                        System.out.println("Total no. of Downloads - 2 Million + ");
                                        System.out.println("Rating - 4.7       +");
                                        System.out.println("Cost - 213.00 Rs.");
                                        System.out.println("Type MORE to Learn More about this Movie ");
                                        System.out.println("Type DOWNLOAD to Download this Movie");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                           The Conjuring                       ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Based on a true story, The Conjuring tells the suspenseful tale of Lorraine (Vera Farmiga)");
                                            System.out.println("and Ed Warren (Patrick Wilson), world renowned paranormal investigators, who were called to");
                                            System.out.println("help a family terrorized by a dark presence in a secluded farmhouse. Forced to confront a ");
                                            System.out.println("powerful demonic entity, the Warrens find themselves caught in the most terrifying case of ");
                                            System.out.println("their lives, after working such cases as the Amityville Horror and the Haunting in Connecticut. ");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Movie");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Play this Movie in your Device after 1 hr 53 mins");
                                                System.out.println("Thank you for choosing our Movie");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Play this Movie in your Device after 1hr 53 mins");
                                            System.out.println("Thank you for choosing our Movie");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 6:
                                        flag2=1;                                     
                                        break;
                                        case 7:
                                        this.main();
                                        break;
                                        case 8:
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                        System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.exit(0);
                                        break;
                                        default:
                                        System.out.println("Invalid Choice"); 
                                    }
                                    if(flag2==1)
                                        break;
                                }
                                break;
                                case 3:
                                while(rpeat>0)
                                {
                                    System.out.println("Welcome to the Menu of Sci-Fi Movies");
                                    System.out.println("Here's the list of Movies:");
                                    System.out.println("  Movie Name:       Rating:");
                                    System.out.println("1.Interstellar    - 4.6 ");
                                    System.out.println("2.The Martian     - 4.7");
                                    System.out.println("3.Gravity         - 4.6 ");
                                    System.out.println("4.Armageddon      - 4.5");
                                    System.out.println("5.Automata        - 4.4");
                                    System.out.println("6.Back ");
                                    System.out.println("7.Back To Home");
                                    System.out.println("8.Exit");
                                    System.out.println("Please Enter Your Choice:");
                                    i=in.nextInt();
                                    switch(i)
                                    {
                                        case 1:
                                        System.out.println("INTERSTELLAR : ");
                                        System.out.println("Size - 1.32 GB ");
                                        System.out.println("Total no. of Downloads - 2 Million + ");
                                        System.out.println("Rating - 4.6       +");
                                        System.out.println("Cost - 154.00 Rs.");
                                        System.out.println("Type MORE to Learn More about this Movie ");
                                        System.out.println("Type DOWNLOAD to Download this Movie");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                         Interstellar                      ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("With our time on Earth coming to an end, a team of explorers undertakes the most important mission ");
                                            System.out.println("in human history: traveling beyond this galaxy to discover whether mankind has a future among the stars. ");
                                            System.out.println("From acclaimed filmmaker Christopher Nolan (The Dark Knight films, Inception), Interstellar  ");
                                            System.out.println("stars Oscar winner Matthew McConaughey (Dallas Buyers Club), Oscar winner Anne Hathaway  ");
                                            System.out.println("(Les Misérables), Oscar nominee Jessica Chastain (Zero Dark Thirty), Bill Irwin ");
                                            System.out.println("(Rachel Getting Married), Oscar winner Ellen Burstyn (Alice Doesn't Live Here Anymore),");
                                            System.out.println("and Oscar winner Michael Caine (The Cider House Rules). The main cast also includes ");
                                            System.out.println("Wes Bentley, Casey Affleck, David Gyasi, Mackenzie Foy and Topher Grace. ");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Movie");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Play this Movie in your Device after 1 hr 27 mins");
                                                System.out.println("Thank you for choosing our Movie");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Play this Movie in your Device after 1 hr 27 mins");
                                            System.out.println("Thank you for choosing our Movie");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 2:
                                        System.out.println("THE MARTIAN : ");
                                        System.out.println("Size - 1.78 GB ");
                                        System.out.println("Total no. of Downloads - 2 Million + ");
                                        System.out.println("Rating - 4.7       +");
                                        System.out.println("Cost - 218.00 Rs.");
                                        System.out.println("Type MORE to Learn More about this Movie ");
                                        System.out.println("Type DOWNLOAD to Download this Movie");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                        The Martian                      ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("From legendary director Ridley Scott (Alien, Prometheus) comes a gripping tale of human strength");
                                            System.out.println("and the will to survive. During a mission to Mars, American astronaut Mark Watney (Matt Damon)");
                                            System.out.println("is presumed dead and left behind. But Watney is still alive. Against all odds, he must find");
                                            System.out.println("a way to contact Earth in the hope that scientists can devise a rescue plan to bring him home. ");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Movie");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Play this Movie in your Device after 2 hrs");
                                                System.out.println("Thank you for choosing our Movie");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Play this Movie in your Device after 2 hrs");
                                            System.out.println("Thank you for choosing our Movie");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 3:
                                        System.out.println("GRAVITY : ");
                                        System.out.println("Size - 1.80 GB ");
                                        System.out.println("Total no. of Downloads - 5 Million + ");
                                        System.out.println("Rating - 4.5       +");
                                        System.out.println("Cost - 140.00 Rs.");
                                        System.out.println("Type MORE to Learn More about this Movie ");
                                        System.out.println("Type DOWNLOAD to Download this Movie");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                          Gravity                      ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Sandra Bullock and George Clooney star in this heart-pounding thriller written, set in the ");
                                            System.out.println(" infinite and unforgiving realm of deep space. Bullock plays a brilliant medical engineer on her");
                                            System.out.println("first shuttle mission, with Clooney as a veteran astronaut in command of his last flight before");
                                            System.out.println("retiring. But on a seemingly routine spacewalk, disaster strikes. The shuttle is destroyed, ");
                                            System.out.println("leaving the two completely alone -- tethered to nothing but each other and spiraling out into");
                                            System.out.println("the blackness. The deafening silence tells them they have lost any link to Earth...and any ");
                                            System.out.println("chance for rescue. As fear turns to panic, every gulp of air eats away at what little oxygen ");
                                            System.out.println("is left. But the only way home may be to go further out into the terrifying expanse of space.");     
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this Movie");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Play this Movie in your Device after 1hr 19 mins");
                                                System.out.println("Thank you for choosing our Movie");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Play this Movie in your Device after 1 hr 19 mins");
                                            System.out.println("Thank you for choosing our Movie");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 4:
                                        System.out.println("ARMAGEDDON : ");
                                        System.out.println("Size - 1.27 GB ");
                                        System.out.println("Total no. of Downloads - 500 Thousand + ");
                                        System.out.println("Rating - 4.5       +");
                                        System.out.println("Cost - 169.00 Rs.");
                                        System.out.println("Type MORE to Learn More about this Movie ");
                                        System.out.println("Type DOWNLOAD to Download this Movie");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                        Armageddon                       ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("From the blockbuster-making team who produced and directed PEARL HARBOR and THE ROCK ");
                                            System.out.println(" (Jerry Bruckheimer and Michael Bay) comes the biggest movie of 1998 -- ARMAGEDDON! Starring the ");
                                            System.out.println(" explosive talents of Bruce Willis (DIE HARD), Academy Award(R)-winners Ben Affleck (GOOD WILL HUNTING)");
                                            System.out.println(" and Billy Bob Thornton (SLING BLADE), Liv Tyler (THE LORD OF THE RINGS trilogy), Steve Buscemi");
                                            System.out.println("(CON AIR), and Will Patton (GONE IN 60 SECONDS), ARMAGEDDON is a meteor storm of action-adventure");
                                            System.out.println("moviemaking that has you on the edge of your seat forgetting to breathe! When NASA's ");
                                            System.out.println(" executive director, Dan Truman (Thornton), realizes the Earth has 18 days before it's");
                                            System.out.println("obliterated by a meteor the size of Texas");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Movie");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Play this Movie in your Device after 1 hr 18 mins");
                                                System.out.println("Thank you for choosing our Movie");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Play this Movie in your Device after 1 hr 08 mins");
                                            System.out.println("Thank you for choosing our Movie");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 5:
                                        System.out.println("AUTOMATA : ");
                                        System.out.println("Size - 1.07 GB ");
                                        System.out.println("Total no. of Downloads - 500 Thousand + ");
                                        System.out.println("Rating - 4.4       +");
                                        System.out.println("Cost - 174.00 Rs.");
                                        System.out.println("Type MORE to Learn More about this Movie ");
                                        System.out.println("Type DOWNLOAD to Download this Movie");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                          Automata                      ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Auto Mata In a future where Earth's ecosystem verges on collapse, man-made robots roam the cities");
                                            System.out.println("to protect dwindling human life. When a robot overrides a key protocol put in place to protect");
                                            System.out.println("human life, ROC Robotics insurance agent Jacq Vaucan (Antonio Banderas) is assigned to locate");
                                            System.out.println("the source of the manipulation and eliminate the threat. What he discovers leads Vaucan, ");
                                            System.out.println("ROC Robotics and the police into a battle with profound consequences for the future of humanity");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Movie");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Play this Movie in your Device after 1 hr 5 mins");
                                                System.out.println("Thank you for choosing our Movie");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Play this Movie in your Device after 1 hr 5 mins");
                                            System.out.println("Thank you for choosing our Movie");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 6:

                                        break;
                                        case 7:
                                        this.main();
                                        break;
                                        case 8:
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                        System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.exit(0);
                                        break;
                                        default:
                                        System.out.println("Invalid Choice"); 
                                    }
                                    if(flag3==1)
                                        break;
                                }
                                break;
                                case 4:
                                flag4=1;
                                break;
                                case 5:
                                this.main();
                                break;
                                case 6:
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.exit(0);
                                break;
                                default:
                                System.out.println("Invalid Choice"); 
                            }
                            if(flag4==1)
                                break;
                        }
                        break;
                        case 4:
                        this.main();
                        break;
                        case 5:
                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                        System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                        System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                        System.exit(0);
                        break;
                        default:
                        System.out.println("Invalid Choice!");
                    }
                }
                break;
                case 3:
                while(rpeat>0)
                {
                    System.out.println("Under which Category do you want to Check for your Game to be Downloaded");
                    System.out.println("1. Top Free");
                    System.out.println("2. Top Paid");
                    System.out.println("3. Trending");
                    System.out.println("4. Categories");
                    System.out.println("5. Back to Home");
                    System.out.println("6. Exit");
                    System.out.println("Please Enter Your Choice:");
                    int choice3 = in.nextInt();
                    switch(choice3)
                    {
                        case 1:
                        while(rpeat>0)
                        {
                            System.out.println("Welcome to the TOP FREE Menu of Games");
                            System.out.println("Here's the list of Games:");
                            System.out.println("  Game Name:              Rating:");
                            System.out.println("1.Candy Crush Saga       -4.1");
                            System.out.println("2.Clash of Clans         -4.4");
                            System.out.println("3.Teen Patti Ultimate    -4.3");
                            System.out.println("4.Brain it on!           -4.5");
                            System.out.println("5.Clash Royale           -4.2");
                            System.out.println("6.Back ");
                            System.out.println("7.Back To Home");
                            System.out.println("8.Exit");
                            System.out.println("Please Enter Your Choice:");
                            int i=in.nextInt();
                            switch(i)
                            {
                                case 1:
                                System.out.println("CANDY CRUSH SAGA : ");
                                System.out.println("Size - 14.10 MB ");
                                System.out.println("Total no. of Downloads - 2.5 Billion + ");
                                System.out.println("Rating - 4.1       +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                   Candy Crush Saga                             ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Candy Crush Saga, from the makers of Candy Crush Soda Saga & Farm Heroes Saga!");
                                    System.out.println("Join Tiffi and Mr. Toffee on their sweet adventure through the Candy Kingdom. Travel through magical");
                                    System.out.println("lands, visiting wondrous places and meeting deliciously kookie characters! Switch and match your");
                                    System.out.println("way through hundreds of levels in this delicious puzzle adventure. ");
                                    System.out.println("The sweetest game just keeps getting sweeter!");            
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Game");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this Game in your Device after 20 mins");
                                        System.out.println("Thank you for choosing our Game");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this Game in your Device after 20 mins");
                                    System.out.println("Thank you for choosing our Game");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 2:
                                System.out.println("CLASH OF CLANS : ");
                                System.out.println("Size - 58.79 MB ");
                                System.out.println("Total no. of Downloads - 1 Billion + ");
                                System.out.println("Rating - 4.4       +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                      Clash of Clans                         ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("From rage-filled Barbarians with glorious mustaches to pyromaniac wizards, raise your own army");
                                    System.out.println("and lead your clan to victory! Build your village to fend off raiders, battle against millions of");
                                    System.out.println("players worldwide, and forge a powerful clan with others to destroy enemy clans");     
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Game");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this Game in your Device after 43 mins");
                                        System.out.println("Thank you for choosing our Game");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this Game in your Device after 43 mins");
                                    System.out.println("Thank you for choosing our Game");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 3:
                                System.out.println("TEEN PATTI ULTIMATE : ");
                                System.out.println("Size - 34.56 MB ");
                                System.out.println("Total no. of Downloads - 1 Billion + ");
                                System.out.println("Rating - 4.3      +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                    Teen Patti Ultimate                       ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("***THE ORIGINAL TEEN PATTI SENSATION, LARGEST MULTIPLAYER CARD GAME IN THE WORLD. MILLIONS PLAYING EVERYDAY***");
                                    System.out.println("Play Teen Patti LIVE and compete with your friends and players around the world!");
                                    System.out.println("Get 1,00,000 FREE CHIPS on download. Play variations!!");
                                    System.out.println(" Also use your chips to *********bet on Live Cricket Matches********** with REALTIME LIVE ODDS!!");
                                    System.out.println(" PLAY WITH FRIENDS or millions of REAL HUMANS");     
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Game");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this Game in your Device after 25 mins");
                                        System.out.println("Thank you for choosing our Game");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this Game in your Device after 25 mins");
                                    System.out.println("Thank you for choosing our Game");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 4:
                                System.out.println("BRAIN IT ON! : ");
                                System.out.println("Size - 53.91 MB ");
                                System.out.println("Total no. of Downloads - 1 Million + ");
                                System.out.println("Rating - 4.5       +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                    Brain it on!                            ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Brain It On! is like Crayon Physics meets Draw Something. But it's challenging though,");
                                    System.out.println(" if you find it too hard you might want to check out something easier like Brain Dots."); 
                                    System.out.println(" This game is not supported on emulated platforms like BlueStacks.");     
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Game");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this Game in your Device after 41 mins");
                                        System.out.println("Thank you for choosing our Game");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this Game in your Device after 41 mins");
                                    System.out.println("Thank you for choosing our Game");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 5:
                                System.out.println("CLASH ROYALE : ");
                                System.out.println("Size - 87.89 MB ");
                                System.out.println("Total no. of Downloads - 5 Million + ");
                                System.out.println("Rating - 4.2       +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                       Clash Royale                       ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Enter the Arena! From the creators of Clash of Clans comes a real-time multiplayer game starring ");
                                    System.out.println("the Royales, your favorite Clash characters and much, much more.");
                                    System.out.println("Collect and upgrade dozens of cards featuring the Clash of Clans troops,");
                                    System.out.println("spells and defenses you know and love, as well as the Royales: Princes, Knights, Baby Dragons and more.");
                                    System.out.println("Knock the enemy King and Princesses from their towers to defeat your opponents and win Trophies,");
                                    System.out.println("Crowns and glory in the Arena. Form a Clan to share cards and build your very own battle community.");

                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Game");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this Game in your Device after 48 mins");
                                        System.out.println("Thank you for choosing our Game");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this Game in your Device after 48 mins");
                                    System.out.println("Thank you for choosing our Game");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 6:
                                flag=1;
                                break;
                                case 7:
                                this.main();
                                break;
                                case 8:
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.exit(0);
                                break;
                                default:
                                System.out.println("Invalid Choice"); 
                            }
                            if(flag==1)
                                break;
                        }
                        break;
                        case 2:
                        while(rpeat>0)
                        {
                            System.out.println("Welcome to the TOP PAID Menu of Games");
                            System.out.println("Here's the list of Games:");
                            System.out.println("  Game Name:              Rating:");
                            System.out.println("1.Lost Journey           -4.3");
                            System.out.println("2.MineCraft              -4.2");
                            System.out.println("3.Mind Games Pro         -4.5");
                            System.out.println("4.The Dark Knight Rises  -4.0");
                            System.out.println("5.The LEGO Game          -4.0");
                            System.out.println("6.Back ");
                            System.out.println("7.Back To Home");
                            System.out.println("8.Exit");
                            System.out.println("Please Enter Your Choice:");
                            int i=in.nextInt();
                            switch(i)
                            {
                                case 1:
                                System.out.println("LOST JOURNEY : ");
                                System.out.println("Size - 12.02 MB ");
                                System.out.println("Total no. of Downloads - 200 Thousand + ");
                                System.out.println("Rating - 4.3       +");
                                System.out.println("Cost - 15.50 Rs.");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                        Lost Journey                      ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("On a Journey… Lost, but not without Hope");
                                    System.out.println("An angel of heaven comes to Jennifer in the form of a butterfly. This plane of existence");
                                    System.out.println("mirrors the serene world she left behind, but there are secrets – memories – hidden here.");
                                    System.out.println("As Jennifer collects the shards of her memories, she confronts many trials, but the happy");
                                    System.out.println("memories and her strength of spirit solidify her resolve, spurring her onward. With her ");
                                    System.out.println("guide at her side, Jennifer sifts through time and space, reverses gravity, and does the ");
                                    System.out.println("otherwise impossible to find her happiness and her way back to heaven. Jennifer will uncover");
                                    System.out.println("the truth; she will reach the end of her Lost Journey.");

                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Game");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this Game in your Device after 15 mins");
                                        System.out.println("Thank you for choosing our Game");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this Game in your Device after 15 mins");
                                    System.out.println("Thank you for choosing our Game");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 2:
                                System.out.println("MINECRAFT : ");
                                System.out.println("Size - 34.09 MB ");
                                System.out.println("Total no. of Downloads - 500 Thousand + ");
                                System.out.println("Rating - 4.2       +");
                                System.out.println("Cost - 76.90 Rs.");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                        MineCraft                        ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Explore randomly generated worlds and build amazing things from the simplest of homes to the ");
                                    System.out.println("grandest of castles. Play in creative mode with unlimited resources or mine deep into the  ");
                                    System.out.println("world in survival mode, crafting weapons and armor to fend off the dangerous mobs. ");
                                    System.out.println("Craft, create, and explore alone, or with friends on mobile devices or Windows 10. ");

                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Game");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this Game in your Device after 35 mins");
                                        System.out.println("Thank you for choosing our Game");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this Game in your Device after 35 mins");
                                    System.out.println("Thank you for choosing our Game");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 3:
                                System.out.println("MIND GAMES PRO : ");
                                System.out.println("Size - 45.0 MB ");
                                System.out.println("Total no. of Downloads - 500 Thousand + ");
                                System.out.println("Rating - 4.5       +");
                                System.out.println("Cost - 55.0 Rs.");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                     Mind Games Pro                           ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Our latest free update includes a new Story Mode Skin Pack! Don one of 27 new skins Exercise Your Brain!");
                                    System.out.println("This is the unlimited, ad-free, version of the hit brain training app. Mind Games is a");
                                    System.out.println("great collection of games based in part on principles of cognitive psychology to help ");
                                    System.out.println("you practice different mental skills. ");     
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Game");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this Game in your Device after 45 mins");
                                        System.out.println("Thank you for choosing our Game");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this Game in your Device after 45 mins");
                                    System.out.println("Thank you for choosing our Game");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 4:
                                System.out.println("THE DARK KNIGHT RISES : ");
                                System.out.println("Size - 73.34 MB ");
                                System.out.println("Total no. of Downloads - 1 Million + ");
                                System.out.println("Rating - 4.0       +");
                                System.out.println("Cost - 120.90 Rs.");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                The Dark Knight Rises                                ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("The epic conclusion to filmmaker Christopher Nolan’s Batman trilogy arrives on Android in the");
                                    System.out.println("exclusive video game inspired by the movie.");
                                    System.out.println("THE EXCLUSIVE GAME INSPIRED BY THE DARK KNIGHT RISES");
                                    System.out.println("After being gone for eight years, Bruce Wayne gets back into action as Batman. Waiting for him are the ");
                                    System.out.println("mysterious Selina Kyle and Bane, a lethal adversary on a crusade to tear apart Batman’s legacy piece by piece."); 
                                    System.out.println("Meet all of Batman’s allies");

                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Game");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this Game in your Device after 1 hr 15 mins");
                                        System.out.println("Thank you for choosing our Game");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this Game in your Device after 1 hr 15 mins");
                                    System.out.println("Thank you for choosing our Game");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 5:
                                System.out.println("THE LEGO GAME : ");
                                System.out.println("Size - 16.45 MB ");
                                System.out.println("Total no. of Downloads - 2.5 Thousand + ");
                                System.out.println("Rating - 4.0       +");
                                System.out.println("Cost - ");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                     The LEGO Game                           ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("The chase is on as you race through city streets as your favourite DC Comics character.");
                                    System.out.println("Feeling heroic? Play as a DC Super Hero to catch the villain and save the city. Feeling mischievous? ");
                                    System.out.println(" Play as the villain and escape the city before the hero can catch you.");
                                    System.out.println(" Avoid obstacles, pull off awesome stunts and collect studs to unlock new characters,");
                                    System.out.println(" environments and stories.");
                                    System.out.println(" Whether super hero or super villain, fun and excitement awaits around every turn of the wheel in LEGO DC ");  
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Game");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this Game in your Device after 20 mins");
                                        System.out.println("Thank you for choosing our Game");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this Game in your Device after 20 mins");
                                    System.out.println("Thank you for choosing our Game");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 6:
                                flag0=1;
                                break;
                                case 7:
                                this.main();
                                break;
                                case 8:
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.exit(0);
                                break;
                                default:
                                System.out.println("Invalid Choice"); 
                            }
                            if(flag0==1)
                                break;
                        }
                        break;
                        case 3:
                        while(rpeat>0)
                        {
                            System.out.println("Welcome to the TRENDING Menu of Games");
                            System.out.println("Here's the list of Games:");
                            System.out.println("  Game Name:                Rating:");
                            System.out.println("1.Teen Patti-Indian Poker  -4.1");
                            System.out.println("2.Clash of Clans           -4.4");
                            System.out.println("3.Hay Day                  -4.1");
                            System.out.println("4.Subway Surfers Prague    -4.5");
                            System.out.println("5.Clash Royale             -4.2");
                            System.out.println("6.Back ");
                            System.out.println("7.Back To Home");
                            System.out.println("8.Exit");
                            System.out.println("Please Enter Your Choice:");
                            int i=in.nextInt();
                            switch(i)
                            {
                                case 1:
                                System.out.println("TEEN PATTI-INDIAN POKER : ");
                                System.out.println("Size - 23.0 MB ");
                                System.out.println("Total no. of Downloads - 5 Million + ");
                                System.out.println("Rating - 4.1       +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                Teen Patti- Indian Pokar                                ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("***THE ORIGINAL TEEN PATTI SENSATION, LARGEST MULTIPLAYER CARD GAME IN THE WORLD. MILLIONS PLAYING EVERYDAY***");
                                    System.out.println("Play Teen Patti LIVE and compete with your friends and players around the world!");
                                    System.out.println("Get 1,00,000 FREE CHIPS on download. Play variations!!");
                                    System.out.println(" Also use your chips to *********bet on Live Cricket Matches********** with REALTIME LIVE ODDS!!");
                                    System.out.println(" PLAY WITH FRIENDS or millions of REAL HUMANS");     
                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Game");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this Game in your Device after 25 mins");
                                        System.out.println("Thank you for choosing our Game");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this Game in your Device after 25 mins");
                                    System.out.println("Thank you for choosing our Game");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 2:
                                System.out.println("CLASH OF CLANS : ");
                                System.out.println("Size - 58 MB ");
                                System.out.println("Total no. of Downloads - 2 Billion + ");
                                System.out.println("Rating - 4.4       +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                        Clash of Clans                       ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("From rage-filled Barbarians with glorious mustaches to pyromaniac wizards, raise your own army");
                                    System.out.println("and lead your clan to victory! Build your village to fend off raiders, battle against millions of");
                                    System.out.println("players worldwide, and forge a powerful clan with others to destroy enemy clans");     
                                    System.out.println("");
                                    System.out.println("Type DOWNLOAD to Download this Game");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this Game in your Device after 59 mins");
                                        System.out.println("Thank you for choosing our Game");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this Game in your Device after 59 mins");
                                    System.out.println("Thank you for choosing our Game");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 3:
                                System.out.println("HAY DAY : ");
                                System.out.println("Size - 30.88 MB ");
                                System.out.println("Total no. of Downloads -  Thousand + ");
                                System.out.println("Rating - 4.1       +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                         Hay Day                       ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Best. Farm. Ever. Welcome to Hay Day, the most popular farming game on mobiles and tablets,");
                                    System.out.println("number one in 122 countries.");
                                    System.out.println("Hay Day and Google Play Store welcome all players to the Google Play Easter 2016 season during ");
                                    System.out.println("17-31 March. Give your farm a cozy Easter themed touch with newly added time exclusive ");
                                    System.out.println("decorations and play with the rest of the community in our special event during 18-21");
                                    System.out.println("March to win an EGGciting new decoration");

                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Game");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this Game in your Device after 35 mins");
                                        System.out.println("Thank you for choosing our Game");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this Game in your Device after 35 mins");
                                    System.out.println("Thank you for choosing our Game");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 4:
                                System.out.println("SUBWAY SURFERS PRAGUE : ");
                                System.out.println("Size - 16.89 MB ");
                                System.out.println("Total no. of Downloads - 2 Billion  + ");
                                System.out.println("Rating - 4.5       +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                   Subway Surfers Prague                       ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("DASH as fast as you can! ");
                                    System.out.println("DODGE the oncoming trains!");
                                    System.out.println(" Help Jake, Tricky & Fresh escape from the grumpy Inspector and his dog.");
                                    System.out.println("★ Grind trains with your cool crew! ");
                                    System.out.println("★ Colorful and vivid HD graphics! ");
                                    System.out.println("★ Hoverboard Surfing! ");
                                    System.out.println("★ Paint powered jetpack! ");
                                    System.out.println("★ Lightning fast swipe acrobatics! ");
                                    System.out.println("★ Challenge and help your friends!");
                                    System.out.println("Join the most daring chase!");
                                    System.out.println(" A Universal App with HD optimized graphics.");

                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Game");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this Game in your Device after 20 mins");
                                        System.out.println("Thank you for choosing our Game");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this Game in your Device after 20 mins");
                                    System.out.println("Thank you for choosing our Game");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 5:
                                System.out.println("CLASH ROYALE : ");
                                System.out.println("Size - 87.02 MB ");
                                System.out.println("Total no. of Downloads - 10 Million + ");
                                System.out.println("Rating - 4.2       +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                System.out.println("Press any other Button and then Enter to Go Back");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                     Clash Royale                     ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("Enter the Arena! From the creators of Clash of Clans comes a real-time multiplayer game starring ");
                                    System.out.println("the Royales, your favorite Clash characters and much, much more.");
                                    System.out.println("Collect and upgrade dozens of cards featuring the Clash of Clans troops,");
                                    System.out.println("spells and defenses you know and love, as well as the Royales: Princes, Knights, Baby Dragons and more.");
                                    System.out.println("Knock the enemy King and Princesses from their towers to defeat your opponents and win Trophies,");
                                    System.out.println("Crowns and glory in the Arena. Form a Clan to share cards and build your very own battle community.");

                                    System.out.println(""); 
                                    System.out.println("Type DOWNLOAD to Download this Game");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Install this Game in your Device after 1 hr 13 mins");
                                        System.out.println("Thank you for choosing our Game");
                                        System.out.println("==================================================================================================================");
                                        for(long tl=0;tl<=18000000L;tl++)
                                        {
                                            System.out.print("");
                                        }
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                else if(bvar2==true)
                                {
                                    System.out.println("Downloading     /////////////////////");                               
                                    System.out.println("");
                                    System.out.println("You can Install this Game in your Device after 1 hr 13 mins");
                                    System.out.println("Thank you for choosing our Game");
                                    System.out.println("=========================================================================================================================");
                                    for(long tl=0;tl<=18000000L;tl++)
                                    {
                                        System.out.print("");
                                    }
                                }
                                break;
                                case 6:
                                flag1=1;
                                break;
                                case 7:
                                this.main();
                                break;
                                case 8:
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.exit(0);
                                break;
                                default:
                                System.out.println("Invalid Choice"); 
                            }
                            if(flag1==1)
                                break;
                        }
                        break;
                        case 4:
                        while(rpeat>0)
                        {
                            System.out.println("Welcome to the CATEGORIES Menu of Games");
                            System.out.println("Here's your list of Categories:");
                            System.out.println("1.Stratergy");
                            System.out.println("2.Arcade");
                            System.out.println("3.Action");
                            System.out.println("4.Back ");
                            System.out.println("5.Back To Home");
                            System.out.println("6.Exit");
                            System.out.println("Please Enter Your Choice:");
                            int i=in.nextInt();
                            switch(i)
                            {
                                case 1:
                                while(rpeat>0)
                                {
                                    System.out.println("Welcome to the Menu of Stratergy Games");
                                    System.out.println("Here's the list of Games:");
                                    System.out.println("  Game Name:         Rating:");
                                    System.out.println("1.Dragon City      - 4.6 ");
                                    System.out.println("2.Clash of Clans   - 4.4 ");
                                    System.out.println("3.Boom Beach       - 4.4 ");
                                    System.out.println("4.Clash Royale     - 4.2");
                                    System.out.println("5.Hay Day          - 4.5");
                                    System.out.println("6.Back ");
                                    System.out.println("7.Back To Home");
                                    System.out.println("8.Exit");
                                    System.out.println("Please Enter Your Choice:");
                                    i=in.nextInt();
                                    switch(i)
                                    {
                                        case 1:
                                        System.out.println("DRAGON CITY : ");
                                        System.out.println("Size - 48.79 MB ");
                                        System.out.println("Total no. of Downloads - 1 Billion + ");
                                        System.out.println("Rating - 4.6       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Dragon City                        ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Build a magical world in Dragon City! Gain hundreds of dragons, breed them and make them level");
                                            System.out.println("up in order to become a Dragon Master!");
                                            System.out.println("Train your dragons for battle and show off their strength by engaging in combat with other players!");

                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Game");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this Game in your Device after 50 mins");
                                                System.out.println("Thank you for choosing our Game");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this Game in your Device after 50 mins");
                                            System.out.println("Thank you for choosing our Game");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 2:
                                        System.out.println("CLASH OF CLANS : ");
                                        System.out.println("Size - 58.79 MB ");
                                        System.out.println("Total no. of Downloads - 1 Billion + ");
                                        System.out.println("Rating - 4.4       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Clash of Clans                         ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("From rage-filled Barbarians with glorious mustaches to pyromaniac wizards, raise your own army");
                                            System.out.println("and lead your clan to victory! Build your village to fend off raiders, battle against millions of");
                                            System.out.println("players worldwide, and forge a powerful clan with others to destroy enemy clans");     
                                            System.out.println("");	
                                            System.out.println("Type DOWNLOAD to Download this Game");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this Game in your Device after 43 mins");
                                                System.out.println("Thank you for choosing our Game");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this Game in your Device after 43 mins");
                                            System.out.println("Thank you for choosing our Game");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 3:
                                        System.out.println("BOOM BEACH : ");
                                        System.out.println("Size - 37.79 MB ");
                                        System.out.println("Total no. of Downloads - 1 Billion + ");
                                        System.out.println("Rating - 4.4       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                       Boom Beach                         ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Welcome to Boom Beach: come with a plan or leave in defeat!");
                                            System.out.println("Fight the evil Blackguard with brains and brawn in this epic combat strategy game.");
                                            System.out.println("Attack enemy bases to free enslaved islanders and unlock the secrets of this tropical paradise");
                                            System.out.println("Create a Task Force with players around the world to take on the enemy together. ");
                                            System.out.println("Scout, plan, then BOOM THE BEACH!");

                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Game");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this Game in your Device after 40 mins");
                                                System.out.println("Thank you for choosing our Game");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this Game in your Device after 40 mins");
                                            System.out.println("Thank you for choosing our Game");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 4:
                                        System.out.println("CLASH ROYALE : ");
                                        System.out.println("Size - 87.89 MB ");
                                        System.out.println("Total no. of Downloads - 5 Million + ");
                                        System.out.println("Rating - 4.2       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                       Clash Royale                       ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Enter the Arena! From the creators of Clash of Clans comes a real-time multiplayer game starring ");
                                            System.out.println("the Royales, your favorite Clash characters and much, much more.");
                                            System.out.println("Collect and upgrade dozens of cards featuring the Clash of Clans troops,");
                                            System.out.println("spells and defenses you know and love, as well as the Royales: Princes, Knights, Baby Dragons and more.");
                                            System.out.println("Knock the enemy King and Princesses from their towers to defeat your opponents and win Trophies,");
                                            System.out.println("Crowns and glory in the Arena. Form a Clan to share cards and build your very own battle community.");

                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Game");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this Game in your Device after 48 mins");
                                                System.out.println("Thank you for choosing our Game");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this Game in your Device after 48 mins");
                                            System.out.println("Thank you for choosing our Game");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 5:
                                        System.out.println("HAY DAY : ");
                                        System.out.println("Size - 68.90 MB ");
                                        System.out.println("Total no. of Downloads - 5 Million + ");
                                        System.out.println("Rating - 4.5       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Hay Day                       ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Best. Farm. Ever. Welcome to Hay Day, the most popular farming game on mobiles and tablets,");
                                            System.out.println("number one in 122 countries.");
                                            System.out.println("Hay Day and Google Play Store welcome all players to the Google Play Easter 2016 season during ");
                                            System.out.println("17-31 March. Give your farm a cozy Easter themed touch with newly added time exclusive ");
                                            System.out.println("decorations and play with the rest of the community in our special event during 18-21");
                                            System.out.println("March to win an EGGciting new decoration");

                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Game");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this Game in your Device after 1 hr");
                                                System.out.println("Thank you for choosing our Game");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this Game in your Device after 1 hr");
                                            System.out.println("Thank you for choosing our Game");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 6:
                                        flag3=1;
                                        break;
                                        case 7:
                                        this.main();
                                        break;
                                        case 8:
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                        System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.exit(0);
                                        break;
                                        default:
                                        System.out.println("Invalid Choice"); 
                                    }
                                    if (flag3==1)
                                        break;
                                }
                                break;
                                case 2:
                                while(rpeat>0)
                                {
                                    System.out.println("Welcome to the Menu of Arcade Games");
                                    System.out.println("Here's the list of Games:");
                                    System.out.println("  Game Name:         Rating:");
                                    System.out.println("1.Temple Run 2     - 4.6 ");
                                    System.out.println("2.Fan-The Game     - 4.4 ");
                                    System.out.println("3.Kiloo & Sybo     - 4.4 ");
                                    System.out.println("4.Piano Tiles      - 4.2");
                                    System.out.println("5.Subway Surfers   - 4.5");
                                    System.out.println("6.Back ");
                                    System.out.println("7.Back To Home");
                                    System.out.println("8.Exit");
                                    System.out.println("Please Enter Your Choice:");
                                    i=in.nextInt();
                                    switch(i)
                                    {
                                        case 1:
                                        System.out.println("TEMPLE RUN 2 : ");
                                        System.out.println("Size - 9.90 MB ");
                                        System.out.println("Total no. of Downloads - 5 Million + ");
                                        System.out.println("Rating - 4.6       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Temple Run 2                     ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("With over a zillion downloads, Temple Run redefined mobile gaming. Now get more of the ");
                                            System.out.println("exhilarating running, jumping, turning and sliding you love in Temple Run 2!");
                                            System.out.println("Navigate perilous cliffs, zip lines, mines and forests as you try to escape with the cursed idol.");
                                            System.out.println("How far can you run?!");

                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Game");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this Game in your Device after 10 mins");
                                                System.out.println("Thank you for choosing our Game");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this Game in your Device after 10 mins");
                                            System.out.println("Thank you for choosing our Game");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 2:
                                        System.out.println("FAN-THE GAME : ");
                                        System.out.println("Size - 7.90 MB ");
                                        System.out.println("Total no. of Downloads - 5 Million + ");
                                        System.out.println("Rating - 4.4       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Fan-The Game                    ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Charm, Bluff, Sneak and Strike your way to meet Aryan in this fascinating game of Connections!");
                                            System.out.println("Connect with your star at Mannat or in the Studio, in a Cinema Hall or in simply any Mall.");
                                            System.out.println("Do you want to have a stronger connection with your superstar?");
                                            System.out.println("Kya Aap Ho Duniya Ke Sabse Bade Superstar ke Sabse Bade Fan?");

                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Game");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this Game in your Device after 8 mins");
                                                System.out.println("Thank you for choosing our Game");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this Game in your Device after 8 mins");
                                            System.out.println("Thank you for choosing our Game");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 3:
                                        System.out.println("KILOO & SYBO : ");
                                        System.out.println("Size - 17.90 MB ");
                                        System.out.println("Total no. of Downloads - 5 Million + ");
                                        System.out.println("Rating - 4.4       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Kiloo & Sybo                   ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("DASH as fast as you can! ");
                                            System.out.println("DODGE the oncoming trains!");
                                            System.out.println(" Help Jake, Tricky & Fresh escape from the grumpy Inspector and his dog.");
                                            System.out.println("★ Grind trains with your cool crew!"); 
                                            System.out.println("★ Colorful and vivid HD graphics! ");
                                            System.out.println("★ Hoverboard Surfing! ");
                                            System.out.println("★ Paint powered jetpack! ");
                                            System.out.println("★ Lightning fast swipe acrobatics! ");
                                            System.out.println("★ Challenge and help your friends!");
                                            System.out.println("Join the most daring chase!");
                                            System.out.println("A Universal App with HD optimized graphics.");
                                            System.out.println("By Kiloo and Sybo.");

                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Game");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this Game in your Device after 15 mins");
                                                System.out.println("Thank you for choosing our Game");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this Game in your Device after 15 mins");
                                            System.out.println("Thank you for choosing our Game");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 4:
                                        System.out.println("PIANO TILES : ");
                                        System.out.println("Size - 6.90 MB ");
                                        System.out.println("Total no. of Downloads - 1 Million + ");
                                        System.out.println("Rating - 4.2       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                       Piano Tiles                ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Piano Tiles is the sequel to the hugely popular game Piano Tiles (Don't Tap the White Tile).");
                                            System.out.println("New gameplay, first-class sound quality and a global competition mode give your fingers a ");
                                            System.out.println("fast paced thrill with the elegance of piano playing!");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Game");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this Game in your Device after 8 mins");
                                                System.out.println("Thank you for choosing our Game");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this Game in your Device after 8 mins");
                                            System.out.println("Thank you for choosing our Game");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 5:
                                        System.out.println("SUBWAY SURFERS : ");
                                        System.out.println("Size - 19.90 MB ");
                                        System.out.println("Total no. of Downloads - 10 Million + ");
                                        System.out.println("Rating - 4.5       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Subway Surfers                    ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("DASH as fast as you can! ");
                                            System.out.println("DODGE the oncoming trains!");
                                            System.out.println(" Help Jake, Tricky & Fresh escape from the grumpy Inspector and his dog.");
                                            System.out.println("★ Grind trains with your cool crew!"); 
                                            System.out.println("★ Colorful and vivid HD graphics! ");
                                            System.out.println("★ Hoverboard Surfing! ");
                                            System.out.println("★ Paint powered jetpack! ");
                                            System.out.println("★ Lightning fast swipe acrobatics! ");
                                            System.out.println("★ Challenge and help your friends!");
                                            System.out.println("Join the most daring chase!");
                                            System.out.println("A Universal App with HD optimized graphics.");
                                            System.out.println("By Kiloo and Sybo.");

                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Game");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this Game in your Device after 20 mins");
                                                System.out.println("Thank you for choosing our Game");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this Game in your Device after 20 mins");
                                            System.out.println("Thank you for choosing our Game");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 6:
                                        flag4=1;
                                        break;
                                        case 7:
                                        this.main();
                                        break;
                                        case 8:
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                        System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.exit(0);
                                        break;
                                        default:
                                        System.out.println("Invalid Choice"); 
                                    }
                                    if(flag4==1)
                                        break;
                                }
                                break;
                                case 3:
                                while(rpeat>0)
                                {
                                    System.out.println("Welcome to the Menu of Action Games");
                                    System.out.println("Here's the list of Games:");
                                    System.out.println("  Game Name:          Rating:");
                                    System.out.println("1.Shadow Fight 2    - 4.6 ");
                                    System.out.println("2.Street Fighter    - 4.4 ");
                                    System.out.println("3.Tekken            - 4.4 ");
                                    System.out.println("4.The Real Steel    - 4.2");
                                    System.out.println("5.Mortal Kombat X   - 4.5");
                                    System.out.println("6.Back ");
                                    System.out.println("7.Back To Home");
                                    System.out.println("8.Exit");
                                    System.out.println("Please Enter Your Choice:");
                                    i=in.nextInt();
                                    switch(i)
                                    {
                                        case 1:
                                        System.out.println("SHADOW FIGHT 2 : ");
                                        System.out.println("Size - 18.78 MB ");
                                        System.out.println("Total no. of Downloads - 5 Million + ");
                                        System.out.println("Rating - 4.6       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Shadow Fight 2                    ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Shadow Fight 2 is a nail-biting mix of RPG and classical Fighting. This game lets you equip");
                                            System.out.println("your character with countless lethal weapons and rare armor sets, and features dozens of ");
                                            System.out.println(" lifelike-animated Martial Arts techniques! Crush your enemies, humiliate demon bosses,");
                                            System.out.println(" and be the one to close the Gate of Shadows. Do you have what it takes to kick, punch, jump,");
                                            System.out.println(" and slash your way to victory? There’s only one way to find out.");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Game");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this Game in your Device after 20 mins");
                                                System.out.println("Thank you for choosing our Game");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this Game in your Device after 20 mins");
                                            System.out.println("Thank you for choosing our Game");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 2:
                                        System.out.println("STREET FIGHTER  : ");
                                        System.out.println("Size - 10.78 MB ");
                                        System.out.println("Total no. of Downloads - 2 Million + ");
                                        System.out.println("Rating - 4.4       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                       Street Fighter                     ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Come on, challenge the Kung Fu streets. Punch in all enemies, kick out all other Kung Fu fighters. ");
                                            System.out.println("Rush into the streets and become the master of Kung Fu. ");     
                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Game");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this Game in your Device after 11 mins");
                                                System.out.println("Thank you for choosing our Game");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this Game in your Device after 11 mins");
                                            System.out.println("Thank you for choosing our Game");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 3:
                                        System.out.println("TEKKEN : ");
                                        System.out.println("Size - 38.0 MB ");
                                        System.out.println("Total no. of Downloads - 5 Million + ");
                                        System.out.println("Rating - 4.4       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                        Tekken                    ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Don’t just think with your fists in this CCG. Strategy and tactics are key with less than 10s  ");
                                            System.out.println("to make decisions and guess what your competition is planning with their deck.  ");
                                            System.out.println("Winning bouts needs composure, bluffing and intuition. Use combos to destroy your opponents in duels ");
                                            System.out.println("and win global competitions and tournaments. Challenge the best fighters, win bouts and uncover all the cards!  ");
                                            System.out.println("Collect over 190 physical TEKKEN CARD TOURNAMENT Game Cards and bring real-world crossover ");
                                            System.out.println("to the gameplay, with unique QR codes letting yo ");

                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Game");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this Game in your Device after 40 mins");
                                                System.out.println("Thank you for choosing our Game");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this Game in your Device after 40 mins");
                                            System.out.println("Thank you for choosing our Game");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 4:
                                        System.out.println("THE REAL STEEL : ");
                                        System.out.println("Size - 14.78 MB ");
                                        System.out.println("Total no. of Downloads - 2.5 Million + ");
                                        System.out.println("Rating - 4.2       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                        The Real Steel                   ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("GLOBAL PvP IS HERE! Atom and Zeus bring yours legendary online multiplayer battles.");
                                            System.out.println("Take on robot fighters from all across the world to win the Ultimate Championship. ");
                                            System.out.println("Top the Global Leaderboard to win awesome Rewards. The time is now to prove your mettle ");
                                            System.out.println("against the greatest Real Steel WRB fighters on earth. Fight!");

                                            System.out.println(""); 
                                            System.out.println("Type DOWNLOAD to Download this Game");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this Game in your Device after 15 mins");
                                                System.out.println("Thank you for choosing our Game");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this Game in your Device after 15 mins");
                                            System.out.println("Thank you for choosing our Game");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 5:
                                        System.out.println("MORTAL KOMBAT X : ");
                                        System.out.println("Size - 58.78 MB ");
                                        System.out.println("Total no. of Downloads - 10 Million + ");
                                        System.out.println("Rating - 4.5       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        System.out.println("Press any other Button and then Enter to Go Back");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Mortal Kombat X                    ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("Experience the over-the-top, visceral fighting of MORTAL KOMBAT X!"); 
                                            System.out.println("Bring the power of next-gen gaming to your mobile and tablet device with this visually groundbreaking"); 
                                            System.out.println("fighting and card collection game.");  
                                            System.out.println("Assemble an elite team of Mortal Kombat warriors and prove yourself in the "); 
                                            System.out.println("greatest fighting tournament on Earth."); 

                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this Game");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Install this Game in your Device after 1 hr");
                                                System.out.println("Thank you for choosing our Game");
                                                System.out.println("==================================================================================================================");
                                                for(long tl=0;tl<=18000000L;tl++)
                                                {
                                                    System.out.print("");
                                                }
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        else if(bvar2==true)
                                        {
                                            System.out.println("Downloading     /////////////////////");                               
                                            System.out.println("");
                                            System.out.println("You can Install this Game in your Device after 1 hr");
                                            System.out.println("Thank you for choosing our Game");
                                            System.out.println("=========================================================================================================================");
                                            for(long tl=0;tl<=18000000L;tl++)
                                            {
                                                System.out.print("");
                                            }
                                        }
                                        break;
                                        case 6:
                                        flag5=1;
                                        break;
                                        case 7:
                                        this.main();
                                        break;
                                        case 8:
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                        System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                        System.exit(0);
                                        break;
                                        default:
                                        System.out.println("Invalid Choice"); 
                                    }
                                    if(flag5==1)
                                        break;
                                }
                                break;
                                case 4:
                                flag2=1;
                                break;
                                case 5:
                                this.main();
                                break;
                                case 6:
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                                System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                                System.exit(0);
                                break;
                                default:
                                System.out.println("Invalid Choice"); 
                            }
                            if(flag2==1)
                                break;
                        }
                        break;
                        case 5:
                        this.main();
                        break;
                        case 6:
                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                        System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                        System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                        System.exit(0);
                        break;
                        default:
                        System.out.println("Invalid Choice!");
                    }
                }   
                break;
                case 4:
                String app1="Whatsapp",app2="Facebook Lite",app3="Instagram",app4="Shareit",app5="Messenger",app6="MX Player",app7="PowerAmp",app8="Flight Radar",app9="Nova Launcher",app10="Our Groceries Key",app11="Hike",app12="Retrica",app13="DuoLingo",app14="HotStar",app15="Xender",app16="Candy Camera",app17="Pixlr",app18="Collage",app19="Saavn",app20="Gaana",
                app21="Wynk Music",app22="Shazam",app23="Hungama",app24="Amazon India",app25="Flipkart",app26="Jabong",app27="Myntra",app28="OLX";
                String g1="Candy Crush Saga",g2="Clash of Clans",g3="Teen Patti Ultimate",g4="Clash Royale",g5="Brain it on",g6="Lost Journey",g7="MineCraft",g8="Mind Games Pro",g9="The Dark Knight Rises",g10="Hay Day",g11="Subway Surfers",g12="Dragon City",g13="Boom Beach",g14="Temple Run 2",g15="Piano Tiles",g16="Shadow Fight 2",g17="Tekken",g18="Mortal Kombat X";
                String m1="Furious 7",m2="Jurrasic World",m3="Mission Impossible 5",m4="Drishyam",m5="Big Hero 6",m6="Fan",m7="Batman vs Superman",m8="Kapoor and Sons",m9="Kingsman",m10="Civil War",m11="Bombay to Goa",m12="Dhammal",m13="Bangistan",m14="Welcome Back",m15="Pizza",m16="13 B",m17="Annabelle",m18="The Conjuring",m19="Interstellar",m20="The Martian",m21="Gravity",m22="Armeggedon",m23="Automata";
                System.out.println("Please Enter the App or Game or Movie you want to Search -");
                String search=br.readLine();
                if(search.equalsIgnoreCase(app1))
                {
                    this.whatsapp() ;
                }
                else if(search.equalsIgnoreCase(app2))
                {
                    this.fb() ;
                }
                else if(search.equalsIgnoreCase(app3))
                {
                    this.insta() ;
                }
                else if(search.equalsIgnoreCase(app4))
                {
                    this.share() ;
                }
                else if(search.equalsIgnoreCase(app5))
                {
                    this.mess() ;
                }
                else if(search.equalsIgnoreCase(app6))
                {
                    this.mx() ;
                }
                else if(search.equalsIgnoreCase(app7))
                {
                    this.power() ;
                }
                else if(search.equalsIgnoreCase(app8))
                {
                    this.flight() ;
                }
                else if(search.equalsIgnoreCase(app9))
                {
                    this.nova() ;
                }
                else if(search.equalsIgnoreCase(app10))
                {
                    this.grocer() ;
                }
                else if(search.equalsIgnoreCase(app11))
                {
                    this.hike() ;
                }
                else if(search.equalsIgnoreCase(app12))
                {
                    this.retrica() ;
                }
                else if(search.equalsIgnoreCase(app13))
                {
                    this.duo() ;
                }
                else if(search.equalsIgnoreCase(app14))
                {
                    this.hot() ;
                }
                else if(search.equalsIgnoreCase(app15))
                {
                    this.xender() ;
                }
                else if(search.equalsIgnoreCase(app16))
                {
                    this.candycam() ;
                }
                else if(search.equalsIgnoreCase(app17))
                {
                    this.pix() ;
                }
                else if(search.equalsIgnoreCase(app18))
                {
                    this.collage() ;
                }
                else if(search.equalsIgnoreCase(app19))
                {
                    this.saavn() ;
                }
                else if(search.equalsIgnoreCase(app20))
                {
                    this.gaana() ;
                }
                else if(search.equalsIgnoreCase(app21))
                {
                    this.wynk() ;
                }
                else if(search.equalsIgnoreCase(app22))
                {
                    this.shazam() ;
                }
                else if(search.equalsIgnoreCase(app23))
                {
                    this.hungama() ;
                }
                else if(search.equalsIgnoreCase(app24))
                {
                    this.amazon() ;
                }
                else if(search.equalsIgnoreCase(app25))
                {
                    this.flip() ;
                }
                else if(search.equalsIgnoreCase(app26))
                {
                    this.jabong() ;
                }
                else if(search.equalsIgnoreCase(app27))
                {
                    this.myntra() ;
                }
                else if(search.equalsIgnoreCase(app28))
                {
                    this.olx() ;
                }
                else if(search.equalsIgnoreCase(g1))
                {
                    this.candycrush() ;
                }
                else if(search.equalsIgnoreCase(g2))
                {
                    this.coc() ;
                }
                else if(search.equalsIgnoreCase(g3))
                {
                    this.teen();
                }
                else if(search.equalsIgnoreCase(g4))
                {
                    this.clashroyal() ;
                }
                else if(search.equalsIgnoreCase(g5))
                {
                    this.brain() ;
                }
                else if(search.equalsIgnoreCase(g6))
                {
                    this.lost() ;
                }
                else if(search.equalsIgnoreCase(g7))
                {
                    this.minecraft() ;
                }
                else if(search.equalsIgnoreCase(g8))
                {
                    this.mind() ;
                }
                else if(search.equalsIgnoreCase(g9))
                {
                    this.darknight() ;
                }
                else if(search.equalsIgnoreCase(g10))
                {
                    this.hayday() ;
                }
                else if(search.equalsIgnoreCase(g11))
                {
                    this.subway() ;
                }
                else if(search.equalsIgnoreCase(g12))
                {
                    this.dragon() ;
                }
                else if(search.equalsIgnoreCase(g13))
                {
                    this.boom() ;
                }
                else if(search.equalsIgnoreCase(g14))
                {
                    this.temple() ;
                }
                else if(search.equalsIgnoreCase(g15))
                {
                    this.piano() ;
                }
                else if(search.equalsIgnoreCase(g16))
                {
                    this.shadow() ;
                }
                else if(search.equalsIgnoreCase(g17))
                {
                    this.tekken() ;
                }
                else if(search.equalsIgnoreCase(g18))
                {
                    this.mortal() ;
                }
                else if(search.equalsIgnoreCase(m1))
                {
                    this.f7() ;
                }
                else if(search.equalsIgnoreCase(m2))
                {
                    this.jurrasic() ;
                }
                else if(search.equalsIgnoreCase(m3))
                {
                    this.mi5() ;
                }
                else if(search.equalsIgnoreCase(m4))
                {
                    this.drishyam() ;
                }
                else if(search.equalsIgnoreCase(m5))
                {
                    this.bighero() ;
                }
                else if(search.equalsIgnoreCase(m6))
                {
                    this.fan() ;
                }
                else if(search.equalsIgnoreCase(m7))
                {
                    this.bvss() ;
                }
                else if(search.equalsIgnoreCase(m8))
                {
                    this.kapoor() ;
                }
                else if(search.equalsIgnoreCase(m9))
                {
                    this.kingsman() ;
                }
                else if(search.equalsIgnoreCase(m10))
                {
                    this.civilwar() ;
                }
                else if(search.equalsIgnoreCase(m11))
                {
                    this.btog() ;
                }
                else if(search.equalsIgnoreCase(m12))
                {                   
                    this.dhammal() ;
                }
                else if(search.equalsIgnoreCase(m13))
                {
                    this.bangistan() ;
                }
                else if(search.equalsIgnoreCase(m14))
                {
                    this.welcome() ;
                }
                else if(search.equalsIgnoreCase(m15))
                {
                    this.pizza() ;
                }
                else if(search.equalsIgnoreCase(m16))
                {
                    this.b13() ;
                }
                else if(search.equalsIgnoreCase(m17))
                {
                    this.annabelle() ;
                }
                else if(search.equalsIgnoreCase(m18))
                {
                    this.conjuring() ;
                }
                else if(search.equalsIgnoreCase(m19))
                {
                    this.interstellar() ;
                }
                else if(search.equalsIgnoreCase(m20))
                {
                    this.martian() ;
                }
                else if(search.equalsIgnoreCase(m21))
                {
                    this.gravity() ;
                }
                else if(search.equalsIgnoreCase(m22))
                {
                    this.armageddon() ;
                }
                else if(search.equalsIgnoreCase(m23))
                {
                    this.automata() ;
                }
                else
                {
                    System.out.println("Sorry, the Search is Not Available Currently in our App Store");
                }
                break;
                case 5:
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("                                                       THANK-YOU FOR VISITING  :)                         ");
                System.out.println("                                                       PLEASE VISIT AGAIN........                         ");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.exit(0);
                break;
                default :
                System.out.println("Invalid Choice!");
            }
        }
    }

    void whatsapp()
    {
        System.out.println("WHATSAPP :");
        System.out.println("Size - 14.18 MB");
        System.out.println("No. of Downloads - 2 Billion +");
        System.out.println("Rating - 4.6      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");                                    
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                      Whatsapp                                              ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("WhatsApp Messenger is a FREE messaging app available for Android and other smartphones. WhatsApp uses your phone's");
            System.out.println(" Internet connection (4G/3G/2G/EDGE or Wi-Fi, as available) to let you message and call friends and family. Switch from SMS to  ");
            System.out.println(" WhatsApp to send and receive messages, calls, photos, videos, documents, and Voice Messages.");
            System.out.println(" WHY USE WHATSAPP:");
            System.out.println("• NO FEES: WhatsApp uses your phone's Internet connection (4G/3G/2G/EDGE or Wi-Fi, as available) to let you message and call .");
            System.out.println("• MULTIMEDIA: Send and receive photos, videos, documents, and Voice Messages.");
            System.out.println("• FREE CALLS: Call your friends and family for free with WhatsApp Calling, even if they're in another country.");
            System.out.println("• GROUP CHAT: Enjoy group chats with your contacts so you can easily stay in touch with your friends or family ");  
            System.out.println("");
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 15 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 15 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void fb()
    {
        System.out.println("FACEBOOK LITE :");
        System.out.println("Size - 21.07 MB");
        System.out.println("Total no. of Downloads - 1 Billion +");
        System.out.println("Rating - 4.7      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                    Facebook Lite                                         ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("This version of Facebook uses less data and works in all network conditions.");
            System.out.println("Facebook Lite:");
            System.out.println("• Installs fast – the app is smaller, so it's quick to download and uses less storage space.");
            System.out.println("• Loads quickly - it is our fastest app. Upload photos faster and see updates from friends.");
            System.out.println("• Uses less data - be more efficient with your mobile data. Save money by using less data.");
            System.out.println("• Works on all networks - it is designed for 2G networks and areas with slow or unstable internet connections.");
            System.out.println("• Works on most Android phones - you can use it on almost any type of Android phone, new or old.");
            System.out.println("For the full Facebook app, install Facebook for Android: http://bit.ly/18exgL6");
            System.out.println("Keeping up with friends is faster than ever. Facebook is free and always will be.");
            System.out.println("  About Facebook:");
            System.out.println("• Message friends and have group conversations");
            System.out.println("• Get notifications when friends like and comment on your posts");
            System.out.println("• See what friends are up to");
            System.out.println("• Share updates and photos");
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 23 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 23 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void insta()
    {
        System.out.println("INSTAGRAM : ");
        System.out.println("Size - 24.30 MB ");
        System.out.println("Total no. of Downloads - 1.5 Billion + ");
        System.out.println("Rating - 4.4      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                      Instagram                                           ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Instagram is a simple way to capture and share the world's moments. Transform your everyday photos and videos"); 
            System.out.println("into works of art and share them with your family and friends."); 
            System.out.println("See the world through somebody else's eyes by following not only the people you know, but inspirational"); 
            System.out.println("Instagrammers, photographers, athletes, celebrities and fashion icons. Every time you open Instagram, you'll see new photos and "); 
            System.out.println("videos from your closest friends, plus breathtaking moments shared by creative people across the globe."); 
            System.out.println("Over 400 million people use Instagram to:"); 
            System.out.println("* Edit photos and videos with free, custom-designed filters. "); 
            System.out.println("* Improve photos with 10 advanced creative tools to change brightness, contrast and saturation "); 
            System.out.println("as well as shadows, highlights and perspective."); 
            System.out.println("* Find people to follow based on the accounts and photos they already love."); 
            System.out.println("* Instantly share photos and videos on Facebook, Twitter, Tumblr and other social networks. "); 
            System.out.println("* Connect with Instagrammers all over the world and keep up with their photos and videos. "); 
            System.out.println("* Send private photo and video messages directly to friends."); 
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 25 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 25 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void share()
    {
        System.out.println("SHAREIT : ");
        System.out.println("Size - 8.08 MB ");
        System.out.println("Total no. of Downloads - 2 Million + ");
        System.out.println("Rating - 4.3      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                       ShareIt                                                  ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("SHAREit, the world's fastest cross-platform file transfer tool.");  
            System.out.println("- Share all kinds of files whenever and wherever.");  
            System.out.println("- 200 times Bluetooth speed!");  
            System.out.println("- No USB! No data usage! No internet needed!");  
            System.out.println("- Supports Android, iOS (iPhone/iPad), Windows Phone, Windows, and Mac.");  
            System.out.println("- The choice of OVER 400 Million users from 200 countries.");  
            System.out.println("- Top 1 downloaded App on Google Play in 15 countries and regions.");  
            System.out.println("【Main features】");  
            System.out.println("► No network restriction");  
            System.out.println("Share files whenever & wherever!");  
            System.out.println("► Fastest in the world");  
            System.out.println("200 times faster than Bluetooth, the highest speed goes up to 20M/s.");  
            System.out.println("► Cross-platform transferring");  
            System.out.println("Cross-platform sharing for phones & computers & tablets, Android & iOS & Windows Phone & Windows XP/7/8.");  
            System.out.println("► Transfer whatever you have");  
            System.out.println("Photos, videos, music, installed apps and any other files.");  
            System.out.println("► Simple and Easy");  
            System.out.println("Friends can transfer files to each other by entering Portal. So easy to share!");  
            System.out.println("► Connect to PC");  
            System.out.println("Transfer files between phone and PC");  
            System.out.println("View your photos and play music on computers.");  
            System.out.println("Control PPT directly with your phone, making your presentation easier!");  
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 10 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 10 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }

    }

    void mess()
    {
        System.out.println("MESSENGER : ");
        System.out.println("Size - 12.01 MB ");
        System.out.println("Total no. of Downloads - 1.5 Billion + ");
        System.out.println("Rating - 4.5      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                     Messenger                                                 ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Instantly reach the people in your life—for free. Messenger is just like texting, but you don't have to pay for ");  
            System.out.println("every message (it works with your data plan).");  
            System.out.println("Not just for Facebook friends: Message people in your phone book and just enter a phone number to add a new contact.");  
            System.out.println("Group chats: Create groups for the people you message most. Name them, set group photos and keep them all in one place.");  
            System.out.println("Photos and videos: Shoot videos and snap selfies or other photos right from the app and send them with one tap.");  
            System.out.println("Chat heads: Keep the conversation going while you use other apps.");  
            System.out.println("Free calls: Talk as long as you want, even with people in other countries. ");  
            System.out.println("(Calls are free over Wi-Fi. Otherwise, standard data charges apply.)");  
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 15 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 15 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 
    }

    void mx()
    {
        System.out.println("MX PLAYER : ");
        System.out.println("Size - 19.23 MB ");
        System.out.println("Total no. of Downloads - 100 Thousand + ");
        System.out.println("Rating - 4.1      +");
        System.out.println("Cost - 40.00 Rs.");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                     MX Player                                           ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("MX Player - The best way to enjoy your movies."); 
            System.out.println("a) HARDWARE ACCELERATION - Hardware acceleration can be applied to more videos with the help of new HW+ decoder."); 
            System.out.println("b) MULTI-CORE DECODING - MX Player is the first Android video player which supports multi-core decoding. Test result ");
            System.out.println("   proved that dual-core device’s performance is up to 70% better than single-core devices."); 
            System.out.println("c) PINCH TO ZOOM, ZOOM AND PAN - Easily zoom in and out by pinching and swiping across the screen.");
            System.out.println("   Zoom and Pan is also available by option."); 
            System.out.println("d) SUBTITLE GESTURES - Scroll forward/backward to move to next/previous text, Up/down to move text up and down, ");
            System.out.println("   Zoom in/out to change text size."); 
            System.out.println("e) KIDS LOCK - Keep your kids entertained without having to worry that they can make calls or touch other apps."); 
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 21 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 21 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 
    }

    void power()
    {
        System.out.println("POWERAMP MUSIC PLAYER : ");
        System.out.println("Size - 13.13  MB ");
        System.out.println("Total no. of Downloads - 500  Thousand + ");
        System.out.println("Rating - 4.6       +");
        System.out.println("Cost - 89.42  Rs.");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                PowerAmp Music Palyer                                    ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Poweramp is a powerful music player for Android.");
            System.out.println("Follow us on twitter @PowerampAPP to get instant updates on app development progress, feature spotlight, theme sharing, ");
            System.out.println("take part in giveaways and even chances for free copies of Poweramp.");
            System.out.println("Please check Common Questions/Answers below in the description.");
            System.out.println("Key Features:");
            System.out.println("- plays mp3, mp4/m4a (incl. alac), ogg, wma*, flac, wav, ape, wv, tta, mpc, aiff ");
            System.out.println("- 10 band optimized graphical equalizer for all supported formats, presets, custom presets");
            System.out.println("- separate powerful Bass and Treble adjustment");
            System.out.println("- stereo eXpansion, mono mixing, balance");
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 15 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 15 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }  
    }

    void flight()
    {
        System.out.println("FLIGHT RADAR : ");
        System.out.println("Size - 7.70 MB ");
        System.out.println("Total no. of Downloads - 200 Thousand + ");
        System.out.println("Rating - 4.6      +");
        System.out.println("Cost - 12.00 Rs.");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                   Flight Radar                                          ");
            System.out.println("╚══════════════════════════════════════════════════╝");
            System.out.println("Turn your phone or tablet into an air traffic radar and see planes around the world move in real-time on a detailed");
            System.out.println("map. Or point your Android device at a plane in the sky to find out where it’s going and more. Discover today why ");
            System.out.println(" millions are already using Flightradar24 - Flight Tracker.");
            System.out.println(" Features that have helped make Flightradar24 - Flight Tracker the #1 selling app in 100+ countries and the #1 ");
            System.out.println("Travel app in 140+ countries (United States, France, United Kingdom, Germany and more) include: ");
            System.out.println("* Watch planes move in real-time on detailed map");
            System.out.println("* Identify planes flying overhead by simply pointing your device at the sky (the augmented reality view requires ");
            System.out.println("rear camera, accelerometer & magnetic sensor)");
            System.out.println(" * Experience what the pilot of a an aircraft sees in real-time and in 3D");
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 11 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 11 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 
    }

    void nova()
    {
        System.out.println("NOVA LAUNCHER : ");
        System.out.println("Size - 17.0 MB ");
        System.out.println("Total no. of Downloads - 1 Million  Thousand + ");
        System.out.println("Rating - 4.7      +");
        System.out.println("Cost - 48.60 Rs.");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                   Nova Launcher                                           ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("The highly customizable, performance driven, home screen");
            System.out.println("Accept no substitutes! Nova Launcher is the top launcher for modern Android, embracing full Material Design throughout."); 
            System.out.println("Nova Launcher replaces your home screen with one you control and can customize. Change icons, layouts, animations and more.");           
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 17 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 17 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }  
    }

    void grocer()
    {
        System.out.println("OUR GROCERIES KEY : ");
        System.out.println("Size - 16.90 MB ");
        System.out.println("Total no. of Downloads - 500 Thousand + ");
        System.out.println("Rating - 4.4      +");
        System.out.println("Cost - 150.00 Rs.");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                  Our Groceries Key                                    ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("OurGroceries automatically keeps your family’s grocery list in sync with the latest changes—on");                              
            System.out.println("every family member’s phone or web browser.");
            System.out.println("Every change to your shared shopping list is visible in seconds. See items being checked off as your partner shops!");
            System.out.println("iPhone and web versions also availability");
            System.out.println("");
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 18 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 18 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void hike()
    {
        System.out.println("HIKE MESSENGER : ");
        System.out.println("Size - 21.64 MB ");
        System.out.println("Total no. of Downloads - 1 Billion + ");
        System.out.println("Rating -  4.5     +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                   Hike Messenger                                           ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Why do you need hike?");
            System.out.println(" ★ HIKE DIRECT: Chat & share files WITHOUT INTERNET and ZERO data charges in classrooms, while travelling, pretty much ");
            System.out.println("anywhere within 100 meters of a friend! Just open a chat, go to the 3 Dot menu & tap Hike Direct to see the magic!");
            System.out.println("★ HIDDEN MODE: An awesome feature which allows you to hide all your private chats from the world and access them only");
            System.out.println(" with a password! Your private conversations are now protected & secure from anyone who takes your phone.");
            System.out.println("★ 5000+ FREE STICKERS: Why say you’re angry when you can show it? When words can’t express it, say it with stickers! ");
            System.out.println("Share thousands of awesome, hilarious & fun stickers with your friends! With the largest collection of Indian regional"); 
            System.out.println("stickers in over 30 regional languages, say more with stickers in your language!");         
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 23 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 23 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 
    }

    void retrica()
    {
        System.out.println("RETRICA : ");
        System.out.println("Size - 12.50 MB ");
        System.out.println("Total no. of Downloads - 2 Million + ");
        System.out.println("Rating - 4.6      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                      Retrica                                        ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("“… if you’re looking for a new photo app that’s loaded with filters, Retrica is the one to download…” - Cnet");
            System.out.println(" For a simple but effective app that’s all about special filters, look no further than Retrica - New York Times");
            System.out.println(" *Ranked #1 Photography app in 65 countries, including England, Italy, Spain, Argentina and Brazil.");
            System.out.println("* Featured on the Google Play 606 times");
            System.out.println("Millions photos are taken daily with Retrica all around the world.");
            System.out.println("Over 250 million downloads");                                        
            System.out.println("");             
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 15 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 15 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void duo()
    {
        System.out.println("DUOLINGO : ");
        System.out.println("Size - 32.33 MB ");
        System.out.println("Total no. of Downloads - 1 Million + ");
        System.out.println("Rating - 4.4      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                     DuoLingo                                             ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Learn English, Spanish, French, German, Italian, Portuguese, Dutch, Irish, Danish, Swedish, Russian,");
            System.out.println("Ukrainian, Esperanto, Polish and Turkish — It’s fast, fun and free.");
            System.out.println("Practice speaking, reading, listening and writing. Play a game, answer questions and complete lessons to improve your vocabulary and grammar. ");
            System.out.println("Start with basic verbs,phrases, and sentences, and learn new words daily.");

            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 33 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 33 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void hot()
    {
        System.out.println("HOTSTAR : ");
        System.out.println("Size - 44.23 MB ");
        System.out.println("Total no. of Downloads - 2 Million + ");
        System.out.println("Rating - 4.6      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                       Hotstar                                        ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("The Best App to watch any Serial any Match or any thing else any where..................");     
            System.out.println("This is simply Hot Star"); 
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 45 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 45 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }  
    }

    void xender()
    {
        System.out.println("XENDER : ");
        System.out.println("Size - 8.56 MB ");
        System.out.println("Total no. of Downloads - 500 Thousand + ");
        System.out.println("Rating - 4.7      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                          Xender                                    ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Xender the better than best app for your file sharing needs");
            System.out.println(" ☆ Share any type of files in any places at any time");
            System.out.println(" ☆ Absolutely without mobile data usage ");
            System.out.println(" ☆ 200 times Bluetooth transfer speed");
            System.out.println(" ☆ Supports Android, IOS, Windows, PC/ Mac cross-platform transferring");
            System.out.println(" ☆ No need for USB connection and PC software installation");
            System.out.println(" ☆ Over 100 million files transferred daily");
            System.out.println(" ☆ Play all music and videos");
            System.out.println(" ☆ Wifi file transfer master");

            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 15 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 15 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }  
    }

    void candycam()
    {
        System.out.println("CANDY CAMERA : ");
        System.out.println("Size - 6.76 MB ");
        System.out.println("Total no. of Downloads - 500 Thousand + ");
        System.out.println("Rating - 4.6      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                    Candy Camera                                         ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Let’s take a selfie!");
            System.out.println("With Candy Camera’s beautifying filters and silent mode,");
            System.out.println("You can take beautiful selfies anywhere and anytime!");
            System.out.println("Don’t miss out on Candy Camera’s amazing filters ");
            System.out.println("1,000,000 people taking selfies with Candy Camera every day!");
            System.out.println(" Filters for Selfies-");
            System.out.println(" A diverse range of filters, designed specifically for selfies –");
            System.out.println("Every Candy Camera filter will make your skin look amazing!");
            System.out.println("Swipe left and right to change between filters,");
            System.out.println("And find the perfect beautifying filter for a selfie!");
            System.out.println("Candy Camera’s filters are shown real-time while you take a selfie,");
            System.out.println("So you always look and feel beautiful with Candy Camera’s filters!");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 10 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 10 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void pix()
    {
        System.out.println("PIXLR : ");
        System.out.println("Size - 9.75 MB ");
        System.out.println("Total no. of Downloads - 1 Million + ");
        System.out.println("Rating - 4.7      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                      Pixlr                                       ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Unlock your creativity with Pixlr - the free photo editor! Capture any moment and make it beautiful");
            System.out.println(" with over 2 million combinations of free effects, overlays, and filters. Once you’re done, share your finished work directly");
            System.out.println("to Instagram, Facebook, Twitter, or your other favorite social networks!");
            System.out.println("Follow Pixlr on Instagram (@pixlr) for tips, tricks, and daily inspiration to make cool photos.");
            System.out.println("We have a fun new photo challenge for you every week.");
            System.out.println("Pixlr (formerly Pixlr Express) is the right photo editor for everyone: whether you have never edited a picture or are a pro, ");
            System.out.println("Pixlr has all the tools and effects you need.");

            System.out.println(""); 

            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 15 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 15 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void collage()
    {
        System.out.println("PIC COLLAGE : ");
        System.out.println("Size - 10.40 MB ");
        System.out.println("Total no. of Downloads - 1 Million + ");
        System.out.println("Rating - 4.5      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                        Pic Collage                                     ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("PicCollage is THE coolest collage-maker in town! Join over 100 million people who use PicCollage ");
            System.out.println("to combine photos, Youtube videos, funky fonts, sassy stickers and cute cutouts to create the prettiest collages you'll");
            System.out.println(" ever see on a mobile device. We have stickers from Sanrio and LA-based independent designer, Sara M. Lyons. ");
            System.out.println("When you're done, you can print your collages and photos as high-quality phone cases, posters, magnets and photo ");
            System.out.println("print-outs as gifts for yourself or your loved ones!");     
            System.out.println("");
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 16 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 16 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 
    }

    void saavn()
    {
        System.out.println("SAAVN : ");
        System.out.println("Size - 22.78 MB ");
        System.out.println("Total no. of Downloads - 500 Thousand + ");
        System.out.println("Rating - 4.4      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                         Saavn                                      ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Saavn is unlimited, free access to all your Bollywood, English, Hindi, and Indian regional songs, ");
            System.out.println("music, and radio stations – wherever you go. ");
            System.out.println("Find your favorite Bollywood, Hindi and English songs, listen to your favorite Indian and International artists,");
            System.out.println("create your own playlists, listen to playlists created by our expert curators, or play online radio from any song ");
            System.out.println("or artist. Saavn delivers the perfect music to suit your mood.");
            System.out.println("Follow your friends and favorite artists to discover and get notified instantly when new content is available. ");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 25 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 25 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void gaana()
    {
        System.out.println("Gaana : ");
        System.out.println("Size - 23.11 MB ");
        System.out.println("Total no. of Downloads - 1 Million + ");
        System.out.println("Rating - 4.7      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                             Gaana                                ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Gaana is the one-stop solution for all your Music needs. Gaana offers you free, unlimited access to all");
            System.out.println("your favorite Songs, Bollywood Music, Regional Music & Radio Mirchi - on your mobile phone, no matter where you are.");
            System.out.println("With our plethora of collection from New Songs to Old Classics, you can enjoy millions of Hindi, English*, Tamil,");
            System.out.println("Telugu, Marathi, Kannada, Punjabi, Malayalam,Bhojpuri, Rajasthani, Bengali, Assamese & Oriya Songs for free.");

            System.out.println("");
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 24 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 24 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 
    }

    void wynk()
    {
        System.out.println("WYNK MUSIC : ");
        System.out.println("Size - 21.91 MB ");
        System.out.println("Total no. of Downloads - 1 Millilon + ");
        System.out.println("Rating - 4.6      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                      Wynk Music                                         ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Wynk is a free music download app for every mood! From Rahman to Rihanna, it has over 2 million songs");
            System.out.println("across Indian and International music. Stream and download songs on Wynk Music app and delve into");
            System.out.println("its huge music library covering all genres namely Bollywood, Pop, Rock, Bhangra, Devotional, ");
            System.out.println("Bhajans, Happy, Sad, Romantic, Party, Chill, Love & Old retro songs. Also, get access to music in");
            System.out.println("Regional languages such as Punjabi, Bhojpuri, Rajasthani, Marathi, Bengali, Kannada, Gujarati, Tamil,");
            System.out.println("Telugu, Malayalam & all other South Indian languages. Not to miss, Ghazals and the Latest &");
            System.out.println("Best of English Music is also there for you");    
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 21 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 21 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void shazam()
    {
        System.out.println("SHAZAM : ");
        System.out.println("Size - 15.98 MB ");
        System.out.println("Total no. of Downloads - 200 Thousand + ");
        System.out.println("Rating - 4.7      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                          Shazam                                    ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Shazam is one of the world’s most popular apps, used by more than 100 million people each month to ");
            System.out.println("identify music, get song lyrics, and now to discover the music that artists discover themselves.");
            System.out.println("Shazam is an app that feels like magic --Techradar.com");
            System.out.println("Identify music instantly and share in the thrill of music discovery with the artists you love.");
            System.out.println("See what top artists like Calvin Harris, Pitbull, Meghan Trainor, Avicii, Jason Derulo, Wiz Khalifa and others are Shazaming.");

            System.out.println("");  
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 15 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 15 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }  
    }

    void hungama()
    {
        System.out.println("HUNGAMA : ");
        System.out.println("Size - 18.0 MB ");
        System.out.println("Total no. of Downloads - 100 Thousand + ");
        System.out.println("Rating - 4.3      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                      Hungama                                    ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Hungama Music App provides free & unlimited access to Songs, Music Videos & Radio from Bollywood,"); 
            System.out.println("Hindi, English, Tamil, Telugu, Punjabi & many other Indian Regional Languages.");
            System.out.println("Delve into Hungama's music collection library of 3 million Songs & Videos sweeping across a wide genre of Bollywood, Pop, Rock,");
            System.out.println("Bhangra, Devotional, Bhajans, Happy, Sad, Romantic, Party, Love & Old songs & Regional like Punjabi, Bhojpuri, Marathi, Bengali,"); 
            System.out.println("Kannada, Gujarati, Tamil, Telugu, Malayalam & other South Indian languages along with Ghazals and the Latest & Best of English Music."); 
            System.out.println("What's more - get full-scale access to music from Retro & Old Hindi Movie songs and some of the Hottest Remixes.");                                              
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 18 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 18 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 
    }

    void amazon()
    {
        System.out.println("AMAZON INDIA : ");
        System.out.println("Size - 14.0 MB ");
        System.out.println("Total no. of Downloads - 5 Million + ");
        System.out.println("Rating - 4.7      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                    Amazon India                                          ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Shop on-the-go from millions of products across categories with the FREE Amazon Shopping App. ");
            System.out.println("The Amazon Shopping App for Android, offers a convenient, fast and secure way to search, browse, ");
            System.out.println("read reviews and make purchases quickly and easily, anytime anywhere.");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 14 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 14 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }  
    }

    void flip()
    {
        System.out.println("FLIPKART : ");
        System.out.println("Size - 24.70 MB ");
        System.out.println("Total no. of Downloads - 5 Million + ");
        System.out.println("Rating - 4.4      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                      Flipkart                                          ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Shop the Online Megastore with the free Flipkart Android app. Choose from the massive selection of original");
            System.out.println("of original products in Fashion, Electronics, Books, Mobiles and other categories. Get timely alerts on great ");
            System.out.println("deals with substantial discounts, every day!");
            System.out.println(" _____________________________________");
            System.out.println(" India’s No 1 Online Shopping App");

            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 25 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 25 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void jabong()
    {
        System.out.println("JABONG : ");
        System.out.println("Size - 21.50 MB ");
        System.out.println("Total no. of Downloads - 500 Thousand + ");
        System.out.println("Rating - 4.2      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                           Jabong                                  ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("INDIA’S BEST FASHION SHOPPING APP");
            System.out.println("Fashion is a beautiful feeling capable of taking people places. This is why we bring you the Jabong ");
            System.out.println("shopping app, which you can take with you wherever you go and get fabulous fashion on-the-go.");
            System.out.println("Download the free Jabong app from the Google Play apps store and shop for dresses, shoes, t-shirts,");
            System.out.println("watches, bags, sunglasses, jewellery, etc. and avail discounts on brands such as Nike, Adidas, Biba,") ;
            System.out.println("W, Catwalk, Titan, Ray Ban, and more. Chosen as India’s most loved online shopping website for the ");
            System.out.println("latest fashion, lifestyle and beauty products, now you can experience the same level of satisfaction ");
            System.out.println("on your android phone with the Jabong fashion app. Jabong offers fast shipping, cash on delivery and ");
            System.out.println("15-days easy returns coupled with exclusive app deals, coupons and offers.");

            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 22 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 22 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 
    }

    void myntra()
    {
        System.out.println("MYNTRA : ");
        System.out.println("Size - 16.94 MB ");
        System.out.println("Total no. of Downloads - 2 Million + ");
        System.out.println("Rating - 4.7      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                        Myntra                                     ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Swipe, select and shop! It’s fashion on the go with the all-new Myntra mobile app.");
            System.out.println("Take the world of online shopping with you everywhere you go and get all ");
            System.out.println(" your favorite fashion merchandise (Ethnic wear,footwear, accessories, beauty products) by top brands.");
            System.out.println(" Browse through 2,50,000+ product styles from 1600+ brands instantly on the Myntra shopping app");

            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 17 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 17 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void olx()
    {
        System.out.println("OLX : ");
        System.out.println("Size - 19.67 MB ");
        System.out.println("Total no. of Downloads - 500 Thousand + ");
        System.out.println("Rating - 4.6      +");
        System.out.println("Type MORE to Learn More about this app ");
        System.out.println("Type DOWNLOAD to Download this app");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                          OLX                                         ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("OLX is a globally recognized and loved! - free classifieds app that lets you buy and sell"); 
            System.out.println("second-hand goods locally. We bring to you a beautifully functional app with a crisp interface "); 
            System.out.println("that lets you find and make great deals for your lesser-used Cars, Bikes, Mobile Phones, "); 
            System.out.println("Electronics, Home & Apparel Fashion, Pets, Baby & Kids Products and more.");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this app");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this App in your Device after 20 mins");
                System.out.println("Thank you for choosing our App");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this App in your Device after 20 mins");
            System.out.println("Thank you for choosing our App");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 
    }

    void candycrush()
    {
        System.out.println("CANDY CRUSH SAGA : ");
        System.out.println("Size - 14.10 MB ");
        System.out.println("Total no. of Downloads - 2.5 Billion + ");
        System.out.println("Rating - 4.1       +");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                   Candy Crush Saga                             ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Candy Crush Saga, from the makers of Candy Crush Soda Saga & Farm Heroes Saga!");
            System.out.println("Join Tiffi and Mr. Toffee on their sweet adventure through the Candy Kingdom. Travel through magical");
            System.out.println("lands, visiting wondrous places and meeting deliciously kookie characters! Switch and match your");
            System.out.println("way through hundreds of levels in this delicious puzzle adventure. ");
            System.out.println("The sweetest game just keeps getting sweeter!");            
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 20 mins");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
            
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 20 mins");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void coc()
    {
        System.out.println("CLASH OF CLANS : ");
        System.out.println("Size - 58.79 MB ");
        System.out.println("Total no. of Downloads - 1 Billion + ");
        System.out.println("Rating - 4.4       +");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                      Clash of Clans                         ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("From rage-filled Barbarians with glorious mustaches to pyromaniac wizards, raise your own army");
            System.out.println("and lead your clan to victory! Build your village to fend off raiders, battle against millions of");
            System.out.println("players worldwide, and forge a powerful clan with others to destroy enemy clans");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 43 mins");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
            
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 43 mins");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 

    }

    void teen()
    {
        System.out.println("TEEN PATTI ULTIMATE : ");
        System.out.println("Size - 34.56 MB ");
        System.out.println("Total no. of Downloads - 1 Billion + ");
        System.out.println("Rating - 4.3      +");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                    Teen Patti Ultimate                       ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("***THE ORIGINAL TEEN PATTI SENSATION, LARGEST MULTIPLAYER CARD GAME IN THE WORLD. MILLIONS PLAYING EVERYDAY***");
            System.out.println("Play Teen Patti LIVE and compete with your friends and players around the world!");
            System.out.println("Get 1,00,000 FREE CHIPS on download. Play variations!!");
            System.out.println(" Also use your chips to *********bet on Live Cricket Matches********** with REALTIME LIVE ODDS!!");
            System.out.println(" PLAY WITH FRIENDS or millions of REAL HUMANS");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 25 mins");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
            
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 25 mins");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }

    }

    void clashroyal()
    {
        System.out.println("CLASH ROYALE : ");
        System.out.println("Size - 87.89 MB ");
        System.out.println("Total no. of Downloads - 5 Million + ");
        System.out.println("Rating - 4.2       +");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                       Clash Royale                       ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Enter the Arena! From the creators of Clash of Clans comes a real-time multiplayer game starring ");
            System.out.println("the Royales, your favorite Clash characters and much, much more.");
            System.out.println("Collect and upgrade dozens of cards featuring the Clash of Clans troops,");
            System.out.println("spells and defenses you know and love, as well as the Royales: Princes, Knights, Baby Dragons and more.");
            System.out.println("Knock the enemy King and Princesses from their towers to defeat your opponents and win Trophies,");
            System.out.println("Crowns and glory in the Arena. Form a Clan to share cards and build your very own battle community.");

            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 48 mins");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
           
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 48 mins");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }

    }

    void brain()
    {

        System.out.println("BRAIN IT ON! : ");
        System.out.println("Size - 53.91 MB ");
        System.out.println("Total no. of Downloads - 1 Million + ");
        System.out.println("Rating - 4.5       +");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                    Brain it on!                            ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Brain It On! is like Crayon Physics meets Draw Something. But it's challenging though,");
            System.out.println(" if you find it too hard you might want to check out something easier like Brain Dots."); 
            System.out.println(" This game is not supported on emulated platforms like BlueStacks.");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 41 mins");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
            
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 41 mins");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void lost()
    {
        System.out.println("LOST JOURNEY : ");
        System.out.println("Size - 12.02 MB ");
        System.out.println("Total no. of Downloads - 200 Thousand + ");
        System.out.println("Rating - 4.3       +");
        System.out.println("Cost - 15.50 Rs.");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                        Lost Journey                      ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("On a Journey… Lost, but not without Hope");
            System.out.println("An angel of heaven comes to Jennifer in the form of a butterfly. This plane of existence");
            System.out.println("mirrors the serene world she left behind, but there are secrets – memories – hidden here.");
            System.out.println("As Jennifer collects the shards of her memories, she confronts many trials, but the happy");
            System.out.println("memories and her strength of spirit solidify her resolve, spurring her onward. With her ");
            System.out.println("guide at her side, Jennifer sifts through time and space, reverses gravity, and does the ");
            System.out.println("otherwise impossible to find her happiness and her way back to heaven. Jennifer will uncover");
            System.out.println("the truth; she will reach the end of her Lost Journey.");

            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 15 mins");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
            
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 15 mins");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }

    }

    void minecraft()
    {
        System.out.println("MINECRAFT : ");
        System.out.println("Size - 34.09 MB ");
        System.out.println("Total no. of Downloads - 500 Thousand + ");
        System.out.println("Rating - 4.2       +");
        System.out.println("Cost - 76.90 Rs.");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                        MineCraft                        ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Explore randomly generated worlds and build amazing things from the simplest of homes to the ");
            System.out.println("grandest of castles. Play in creative mode with unlimited resources or mine deep into the  ");
            System.out.println("world in survival mode, crafting weapons and armor to fend off the dangerous mobs. ");
            System.out.println("Craft, create, and explore alone, or with friends on mobile devices or Windows 10. ");

            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 35 mins");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
            
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 35 mins");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }

    }

    void mind()
    {
        System.out.println("MIND GAMES PRO : ");
        System.out.println("Size - 45.0 MB ");
        System.out.println("Total no. of Downloads - 500 Thousand + ");
        System.out.println("Rating - 4.5       +");
        System.out.println("Cost - 55.0 Rs.");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                     Mind Games Pro                           ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Our latest free update includes a new Story Mode Skin Pack! Don one of 27 new skins Exercise Your Brain!");
            System.out.println("This is the unlimited, ad-free, version of the hit brain training app. Mind Games is a");
            System.out.println("great collection of games based in part on principles of cognitive psychology to help ");
            System.out.println("you practice different mental skills. ");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 45 mins");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
            
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 45 mins");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }

    }

    void darknight()
    {
        System.out.println("THE DARK KNIGHT RISES : ");
        System.out.println("Size - 73.34 MB ");
        System.out.println("Total no. of Downloads - 1 Million + ");
        System.out.println("Rating - 4.0       +");
        System.out.println("Cost - 120.90 Rs.");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                The Dark Knight Rises                                ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("The epic conclusion to filmmaker Christopher Nolan’s Batman trilogy arrives on Android in the");
            System.out.println("exclusive video game inspired by the movie.");
            System.out.println("THE EXCLUSIVE GAME INSPIRED BY THE DARK KNIGHT RISES");
            System.out.println("After being gone for eight years, Bruce Wayne gets back into action as Batman. Waiting for him are the ");
            System.out.println("mysterious Selina Kyle and Bane, a lethal adversary on a crusade to tear apart Batman’s legacy piece by piece."); 
            System.out.println("Meet all of Batman’s allies");

            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 1 hr 15 mins");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
            
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 1 hr 15 mins");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }

    }

    void hayday()
    {
        System.out.println("HAY DAY : ");
        System.out.println("Size - 30.88 MB ");
        System.out.println("Total no. of Downloads -  Thousand + ");
        System.out.println("Rating - 4.1       +");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                         Hay Day                       ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Best. Farm. Ever. Welcome to Hay Day, the most popular farming game on mobiles and tablets,");
            System.out.println("number one in 122 countries.");
            System.out.println("Hay Day and Google Play Store welcome all players to the Google Play Easter 2016 season during ");
            System.out.println("17-31 March. Give your farm a cozy Easter themed touch with newly added time exclusive ");
            System.out.println("decorations and play with the rest of the community in our special event during 18-21");
            System.out.println("March to win an EGGciting new decoration");

            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 35 mins");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
            
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 35 mins");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 

    }

    void subway()
    {
        System.out.println("SUBWAY SURFERS PRAGUE : ");
        System.out.println("Size - 16.89 MB ");
        System.out.println("Total no. of Downloads - 2 Billion  + ");
        System.out.println("Rating - 4.5       +");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                   Subway Surfers Prague                       ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("DASH as fast as you can! ");
            System.out.println("DODGE the oncoming trains!");
            System.out.println(" Help Jake, Tricky & Fresh escape from the grumpy Inspector and his dog.");
            System.out.println("★ Grind trains with your cool crew! ");
            System.out.println("★ Colorful and vivid HD graphics! ");
            System.out.println("★ Hoverboard Surfing! ");
            System.out.println("★ Paint powered jetpack! ");
            System.out.println("★ Lightning fast swipe acrobatics! ");
            System.out.println("★ Challenge and help your friends!");
            System.out.println("Join the most daring chase!");
            System.out.println(" A Universal App with HD optimized graphics.");

            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 20 mins");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
            
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 20 mins");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }  

    }

    void dragon()
    {
        System.out.println("DRAGON CITY : ");
        System.out.println("Size - 48.79 MB ");
        System.out.println("Total no. of Downloads - 1 Billion + ");
        System.out.println("Rating - 4.6       +");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                      Dragon City                        ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Build a magical world in Dragon City! Gain hundreds of dragons, breed them and make them level");
            System.out.println("up in order to become a Dragon Master!");
            System.out.println("Train your dragons for battle and show off their strength by engaging in combat with other players!");

            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 50 mins");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
            
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 50 mins");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }

    }

    void boom()
    {
        System.out.println("BOOM BEACH : ");
        System.out.println("Size - 37.79 MB ");
        System.out.println("Total no. of Downloads - 1 Billion + ");
        System.out.println("Rating - 4.4       +");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                       Boom Beach                         ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Welcome to Boom Beach: come with a plan or leave in defeat!");
            System.out.println("Fight the evil Blackguard with brains and brawn in this epic combat strategy game.");
            System.out.println("Attack enemy bases to free enslaved islanders and unlock the secrets of this tropical paradise");
            System.out.println("Create a Task Force with players around the world to take on the enemy together. ");
            System.out.println("Scout, plan, then BOOM THE BEACH!");

            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 40 mins");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
           
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 40 mins");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 

    }

    void temple()
    {
        System.out.println("TEMPLE RUN 2 : ");
        System.out.println("Size - 9.90 MB ");
        System.out.println("Total no. of Downloads - 5 Million + ");
        System.out.println("Rating - 4.6       +");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                      Temple Run 2                     ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("With over a zillion downloads, Temple Run redefined mobile gaming. Now get more of the ");
            System.out.println("exhilarating running, jumping, turning and sliding you love in Temple Run 2!");
            System.out.println("Navigate perilous cliffs, zip lines, mines and forests as you try to escape with the cursed idol.");
            System.out.println("How far can you run?!");

            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 10 mins");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
            
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 10 mins");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }  

    }

    void piano()
    {
        System.out.println("PIANO TILES : ");
        System.out.println("Size - 6.90 MB ");
        System.out.println("Total no. of Downloads - 1 Million + ");
        System.out.println("Rating - 4.2       +");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                       Piano Tiles                ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Piano Tiles is the sequel to the hugely popular game Piano Tiles (Don't Tap the White Tile).");
            System.out.println("New gameplay, first-class sound quality and a global competition mode give your fingers a ");
            System.out.println("fast paced thrill with the elegance of piano playing!");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 8 mins");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
            
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 8 mins");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 

    }

    void shadow()
    {
        System.out.println("SHADOW FIGHT 2 : ");
        System.out.println("Size - 18.78 MB ");
        System.out.println("Total no. of Downloads - 5 Million + ");
        System.out.println("Rating - 4.6       +");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                      Shadow Fight 2                    ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Shadow Fight 2 is a nail-biting mix of RPG and classical Fighting. This game lets you equip");
            System.out.println("your character with countless lethal weapons and rare armor sets, and features dozens of ");
            System.out.println(" lifelike-animated Martial Arts techniques! Crush your enemies, humiliate demon bosses,");
            System.out.println(" and be the one to close the Gate of Shadows. Do you have what it takes to kick, punch, jump,");
            System.out.println(" and slash your way to victory? There’s only one way to find out.");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 20 mins");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
            
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 20 mins");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 

    }

    void tekken()
    {
        System.out.println("TEKKEN : ");
        System.out.println("Size - 38.0 MB ");
        System.out.println("Total no. of Downloads - 5 Million + ");
        System.out.println("Rating - 4.4       +");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                        Tekken                    ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Don’t just think with your fists in this CCG. Strategy and tactics are key with less than 10s  ");
            System.out.println("to make decisions and guess what your competition is planning with their deck.  ");
            System.out.println("Winning bouts needs composure, bluffing and intuition. Use combos to destroy your opponents in duels ");
            System.out.println("and win global competitions and tournaments. Challenge the best fighters, win bouts and uncover all the cards!  ");
            System.out.println("Collect over 190 physical TEKKEN CARD TOURNAMENT Game Cards and bring real-world crossover ");
            System.out.println("to the gameplay, with unique QR codes letting yo ");

            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 40 mins");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
            
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 40 mins");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }

    }

    void mortal()
    {
        System.out.println("MORTAL KOMBAT X : ");
        System.out.println("Size - 58.78 MB ");
        System.out.println("Total no. of Downloads - 10 Million + ");
        System.out.println("Rating - 4.5       +");
        System.out.println("Type MORE to Learn More about this Game ");
        System.out.println("Type DOWNLOAD to Download this Game");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                      Mortal Kombat X                    ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Experience the over-the-top, visceral fighting of MORTAL KOMBAT X!"); 
            System.out.println("Bring the power of next-gen gaming to your mobile and tablet device with this visually groundbreaking"); 
            System.out.println("fighting and card collection game.");  
            System.out.println("Assemble an elite team of Mortal Kombat warriors and prove yourself in the "); 
            System.out.println("greatest fighting tournament on Earth."); 

            System.out.println("");
            System.out.println("Type DOWNLOAD to Download this Game");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Install this Game in your Device after 1 hr");
                System.out.println("Thank you for choosing our Game");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }
            
        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Install this Game in your Device after 1 hr");
            System.out.println("Thank you for choosing our Game");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }

    }

    void f7()
    {
        System.out.println("FURIOUS 7 : ");
        System.out.println("Size - 2.02 GB ");
        System.out.println("Total no. of Downloads - 1 Million + ");
        System.out.println("Rating - 4.6       +");
        System.out.println("Cost - 120.00  Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                       Furious 7                                     ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Vin Diesel, Paul Walker and Dwayne Johnson lead the returning cast across the globe in their most");
            System.out.println("gravity-defying and emotional adventure yet. Targeted by a cold-blooded black-ops assassin with a score");
            System.out.println("to settle (Jason Statham), their only hope is to get behind the wheel again and secure an ingenious");
            System.out.println(" prototype tracking device. Facing their greatest threat yet in places as far away as Abu Dhabi and");
            System.out.println(" as familiar as the Los Angeles streets they call home, the crew must come together once again as");
            System.out.println(" a team, and as a family, to protect their own. (Original Title - Furious 7) - 2015 Universal Studios");
            System.out.println(" All Rights Reserved.");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after  1 hr 22 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 1 hr 22 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 
    }

    void jurrasic()
    {
        System.out.println("JURRASIC WORLD : ");
        System.out.println("Size - 1.72 GB ");
        System.out.println("Total no. of Downloads - 1.5  Million + ");
        System.out.println("Rating - 4.7       +");
        System.out.println("Cost - 145.00  Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                       Jurrasic World                                 ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Steven Spielberg returns to executive produce the long-awaited next installment of his groundbreaking");
            System.out.println("Jurassic Park series, Jurassic World. Colin Trevorrow directs the epic action-adventure based on ");
            System.out.println("characters created by Michael Crichton. The screenplay is by Rick Jaffa & Amanda Silver and Trevorrow ");
            System.out.println("& Derek Connolly, and the story is by Rick Jaffa & Amanda Silver. Frank Marshall and Patrick Crowley ");
            System.out.println("join the team as producers. (Original Title - Jurassic World) - 2015 Universal Studios. All Rights Reserved. ");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 1 hr 07 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 1 hr 07 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void mi5()
    {
        System.out.println("MISSION IMPOSSIBLE 5 : ");
        System.out.println("Size - 1.45 GB ");
        System.out.println("Total no. of Downloads - 2 Million + ");
        System.out.println("Rating - 4.6       +");
        System.out.println("Cost - 135.50  Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                   Mission Impossible 5                             ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Loaded with heart-pounding action and jaw-dropping stunts, prepare for the best Mission ever.");
            System.out.println("With his elite organization shut down by the CIA, agent Ethan Hunt (Tom Cruise) and his team ");
            System.out.println("(Jeremy Renner, Simon Pegg, Ving Rhames) race against time to stop the rise of a new global threat,");
            System.out.println("The Syndicate, a dangerous network of rogue operatives turned traitors. To stop them, Ethan must");
            System.out.println("join forces with an elusive, disavowed agent (Rebecca Ferguson) who may or may not be on his side ");
            System.out.println("as he faces his most impossible mission yet. ");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 1hr 05 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 1hr 05 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 
    }

    void drishyam()
    {
        System.out.println("DRISHYAM : ");
        System.out.println("Size - 1.01  GB ");
        System.out.println("Total no. of Downloads - 500 Thousand + ");
        System.out.println("Rating - 4.6       +");
        System.out.println("Cost - 90.00  Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                          Drishyam                                ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Vijay Salgaonkar runs a cable TV network in a remote village of Goa. He lives a happy life with");
            System.out.println("his wife Nandini and two daughters. A 4th grade dropout & an orphan, Vijay has worked his way towards");
            System.out.println("success with his sheer hard-work & street smartness in order to provide for his family. His wife, ");
            System.out.println("while she loves him devoutly, wants Vijay's thrifty & miserly behavior to end. If there's one thing");
            System.out.println("that Vijay cannot live without, it is his passion for watching films. Such is his 'filmy' obsession");
            System.out.println("that he doesn't mind staying up all night at his office binging on TV movies! In a bizarre turn of");
            System.out.println("events; a teenage boy goes missing; he is the son of a headstrong & no-nonsense cop; IG Meera Deshmukh");
            System.out.println("and the Salgaonkar family is the prime suspect! Will a humble & middle class man, be able to protect");
            System.out.println("his family from oppression of the powerful? How the family weathers the storm that ensues during the");
            System.out.println("violent investigation forms the rest of the story leading to an unexpected & shocking climax. ");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 59 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 59 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void bighero()
    {
        System.out.println("BIG HERO 6 : ");
        System.out.println("Size - 1.17 GB ");
        System.out.println("Total no. of Downloads - 5 Million + ");
        System.out.println("Rating - 4.8       +");
        System.out.println("Cost - 100.00  Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                       Big Hero 6                                ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("With all the heart and humor audiences expect from Walt Disney Animation Studios, Big Hero 6");
            System.out.println("is an action-packed comedy adventure that introduces Baymax, a lovable personal companion robot who ");
            System.out.println("forms a special bond with robotics prodigy Hiro Hamada. When a devastating turn of events catapults");
            System.out.println("them into the midst of a dangerous plot unfolding in the streets of San Fransokyo, Hiro turns to"); 
            System.out.println("Baymax and his diverse group of friends — adrenaline junkie Go Go Tomago, neatnik Wasabi, ");
            System.out.println("chemistry whiz Honey Lemon and fanboy Fred — who transform into a band of unlikely heroes");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 58 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 58 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void fan()
    {
        System.out.println("FAN : ");
        System.out.println("Size - 1.34 GB ");
        System.out.println("Total no. of Downloads - 1 Million + ");
        System.out.println("Rating - 4.7       +");
        System.out.println("Cost - 140.00  Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                            Fan                           ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("A man (Shah Rukh Khan) develops a dangerous obsession with a movie star who looks just like him.");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 1 hr 03 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 1 hr 03 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }  
    }

    void bvss()
    {
        System.out.println("BATMAN VS SUPERMAN : ");
        System.out.println("Size - 1.98 GB ");
        System.out.println("Total no. of Downloads - 2  Million + ");
        System.out.println("Rating - 4.4       +");
        System.out.println("Cost - 178.00  Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                          Batman vs Superman                             ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("From director Zack Snyder comes “Batman v Superman: Dawn of Justice,” starring Ben Affleck as");
            System.out.println(" Batman/Bruce Wayne and Henry Cavill as Superman/Clark Kent in the characters’ first big-screen pairing. Fearing");
            System.out.println(" the actions of a god-like Super Hero left unchecked, Gotham City’s own formidable, forceful vigilante takes ");
            System.out.println("on Metropolis’s most revered, modern-day savior, while the world wrestles with what sort of hero it really");
            System.out.println("needs. And with Batman and Superman at war with one another, a new threat quickly arises, putting mankind");
            System.out.println(" in greater danger than it’s ever known before.");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 1 hr 39 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 1 hr 39 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }  
    }

    void kapoor()
    {
        System.out.println("KAPOOR AND SONS : ");
        System.out.println("Size - 1.19 GB ");
        System.out.println("Total no. of Downloads - 200  Thousand + ");
        System.out.println("Rating - 4.5       +");
        System.out.println("Cost - 132.00  Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                    Kapoor And Sons                                   ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("A man (Sidharth Malhotra) and his brother (Fawad Khan) fall for the same woman (Alia Bhatt)");  
            System.out.println("while visiting their parents and grandfather in Coonoor, India");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 1 hr 12 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 1 hr 12 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }  
    }

    void kingsman()
    {
        System.out.println("KINGSMAN : ");
        System.out.println("Size - 1.66 GB ");
        System.out.println("Total no. of Downloads - 500  Thousand + ");
        System.out.println("Rating - 4.2       +");
        System.out.println("Cost - 80.00 Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                       KingsMan                                ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("A suave agent from a secret intelligence organization tries to stop a megalomaniacal tech billionaire's");
            System.out.println("evil plot to end climate change through mass murder while the agent's lower class protege struggles to win a ");
            System.out.println("spot in the organization in a tough training program. ");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after  mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after  mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }  
    }

    void civilwar()
    {
        System.out.println("CIVIL WAR : ");
        System.out.println("Size - 1.81 GB ");
        System.out.println("Total no. of Downloads - 1 Million + ");
        System.out.println("Rating - 4.7       +");
        System.out.println("Cost - 167.00 Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                      Civil War                                 ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Political pressure mounts to install a system of accountability when the actions of the Avengers lead ");
            System.out.println("to collateral damage. The new status quo deeply divides members of the team. Captain America ");
            System.out.println("(Chris Evans) believes superheroes should remain free to defend humanity without government ");
            System.out.println(" interference. Iron Man (Robert Downey Jr.) sharply disagrees and supports oversight. As the ");
            System.out.println("debate escalates into an all-out feud, Black Widow (Scarlett Johansson) and"); 
            System.out.println(" Hawkeye (Jeremy Renner) must pick a side.");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 1 hr 40 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 1 hr 40 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 
    }

    void btog()
    {
        System.out.println("BOMBAY TO GOA : ");
        System.out.println("Size - 1.91 GB ");
        System.out.println("Total no. of Downloads - 1 Million + ");
        System.out.println("Rating - 4.6       +");
        System.out.println("Cost - 67.00 Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                     Bombay to Goa                                 ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("The film revolves around two people. Lal is an ambitious guy who wants to start his own");
            System.out.println(" business and make it big in life. Das is a loudmouth, and a very arrogant person. ");
            System.out.println("The two manage to get hold of 5000 rupees and they open a vada pav centre. As luck would ");
            System.out.println("have it, Lal wins Rs. 2 lakhs in a contest. The duo plan to start a travel agency."); 
            System.out.println(" Since they do not have enough money to buy a vehicle, they use spare parts of old cars");
            System.out.println("to create a bus. Trusting Das to come up with a good make of a bus, he blindly hands ");
            System.out.println("over the prize money to him. Lal manages to get passengers for their first ride. ");
            System.out.println(" But when the bus comes all hell breaks loose with people demanding their money back.");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 1 hr 42 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 1 hr 42 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void dhammal()
    {
        System.out.println("DHAMMAL : ");
        System.out.println("Size - 1.00 GB ");
        System.out.println("Total no. of Downloads - 2 Million + ");
        System.out.println("Rating - 4.7       +");
        System.out.println("Cost - 40.00 Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                     Dhammal                                 ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Dhamaal is a fun filled caper about four friends - Roy (Riteish Deshmukh), Manav (Javed Jaafrey),");
            System.out.println("Aditya (Arshad Warsi) and Boman (Ashish Chowdhry). One day while trying to save a dying man, ");
            System.out.println("they find out about hidden treasure. However, one misadventure follows after another. All ");
            System.out.println("four are thrown into hilarious life threatening situations that has the audience in side"); 
            System.out.println(" splitting laughter and guessing - Is there really any hidden treasure?");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 1 hr ");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 1 hr ");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void bangistan()
    {
        System.out.println("BANGISTAN : ");
        System.out.println("Size - 0.99 GB ");
        System.out.println("Total no. of Downloads - 500 Thousand + ");
        System.out.println("Rating - 4.4       +");
        System.out.println("Cost - 34.00 Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                         Bangistan                                 ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Bangistan is a whip smart and uproarious satire on fundamentalism and the story of two unlikely terrorists,");
            System.out.println("the antitheses of each other, with a common destructive goal. Concerned by the unrest in ");
            System.out.println("the name of religion, Subcontinental leaders of Muslims and Hindus, the Imam and the");
            System.out.println("Shankaracharya, announce that they're attending the International Peace Conference in Krakow");
            System.out.println("in a joint effort to help unite the two religions in perpetual harmony. Rival rabble-rousing ");
            System.out.println("ragtag organizations, the Islamist Al-Kaam Tamam and extreme Hindu right-wing Maa Ka Dal ");
            System.out.println("separately recruit and brainwash Hafeez and Praveen to suicide bomb the conference so that");
            System.out.println("they may continue to wield their local influence. ");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 1 hr ");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 1 hr ");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 
    }

    void welcome()
    {
        System.out.println("WELCOME BACK : ");
        System.out.println("Size - 1.05 GB ");
        System.out.println("Total no. of Downloads - 1 Million + ");
        System.out.println("Rating - 4.6       +");
        System.out.println("Cost - 93.00 Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                      Welcome Back                                ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Uday and Manju leave the criminal underworld to become businessmen. ");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 1 hr 05 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 1 hr 05 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }  
    }

    void pizza()
    {
        System.out.println("PIZZA : ");
        System.out.println("Size - 0.78 GB ");
        System.out.println("Total no. of Downloads - 100 Thousand + ");
        System.out.println("Rating - 4.4       +");
        System.out.println("Cost - 20.00 Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                        Pizza                                ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Michael (Vijay Sethupathy) is a pizza delivery boy, who lives with Anu (Ramya Nambeesan). ");
            System.out.println("The latter has a passion to pen a story on spirits and ghosts. In the meantime, ");
            System.out.println("unexpected pregnancy of Anu forces Michael to marry her. When things go smooth, ");
            System.out.println("Michael's life takes a turn when he goes to deliver pizza at a posh bungalow. There he");
            System.out.println("gets struck in the house & comes across creepy moments. The rest is all but a chain of");
            System.out.println("events that leads to an unexpected climax.");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 47 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 47 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void b13()
    {
        System.out.println("13 B : ");
        System.out.println("Size - 0.89 GB ");
        System.out.println("Total no. of Downloads - 200 Thousand + ");
        System.out.println("Rating - 4.5       +");
        System.out.println("Cost - 54.00 Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                           13 B                       ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Manohar, an upper-middle class Indian, moves into a new apartment - 13B on the ");
            System.out.println("13th floor - with his family, fulfilling one of his life's biggest dreams. But the family ");
            System.out.println("is greeted by a series of small trivial incidents such as milk getting spoiled that could ");
            System.out.println("be regarded as inauspicious but are shrugged off by the excited Manohar. The lift in"); 
            System.out.println("the apartment does not operate for Manohar.");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 53 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 53 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 
    }

    void annabelle()
    {
        System.out.println("ANNABELLE : ");
        System.out.println("Size - 1.71 GB ");
        System.out.println("Total no. of Downloads - 500 Thousand + ");
        System.out.println("Rating - 4.6       +");
        System.out.println("Cost - 191.00 Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                         Annabelle                                ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Based on the terrifying doll from The Conjuring. John Form has found the perfect gift for ");
            System.out.println("his expectant wife, Mia—a beautiful, rare vintage doll in a pure white wedding dress. But Mia’s");
            System.out.println("delight with Annabelle doesn’t last long. On one horrific night, their home is invaded by ");
            System.out.println("members of a satanic cult, who violently attack the couple. Spilled blood and terror are ");
            System.out.println("not all they leave behind. The cultists have conjured an entity so malevolent that nothing");
            System.out.println("they did will compare to the sinister conduit to the damned that is now...Annabelle.");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 1 hr 35 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 1 hr 35 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        } 
    }

    void conjuring()
    {
        System.out.println("THE CONJURING : ");
        System.out.println("Size - 2.45 GB ");
        System.out.println("Total no. of Downloads - 2 Million + ");
        System.out.println("Rating - 4.7       +");
        System.out.println("Cost - 213.00 Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                           The Conjuring                       ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Based on a true story, The Conjuring tells the suspenseful tale of Lorraine (Vera Farmiga)");
            System.out.println("and Ed Warren (Patrick Wilson), world renowned paranormal investigators, who were called to");
            System.out.println("help a family terrorized by a dark presence in a secluded farmhouse. Forced to confront a ");
            System.out.println("powerful demonic entity, the Warrens find themselves caught in the most terrifying case of ");
            System.out.println("their lives, after working such cases as the Amityville Horror and the Haunting in Connecticut. ");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 1 hr 53 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 1hr 53 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void interstellar()
    {
        System.out.println("INTERSTELLAR : ");
        System.out.println("Size - 1.32 GB ");
        System.out.println("Total no. of Downloads - 2 Million + ");
        System.out.println("Rating - 4.6       +");
        System.out.println("Cost - 154.00 Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                         Interstellar                      ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("With our time on Earth coming to an end, a team of explorers undertakes the most important mission ");
            System.out.println("in human history: traveling beyond this galaxy to discover whether mankind has a future among the stars. ");
            System.out.println("From acclaimed filmmaker Christopher Nolan (The Dark Knight films, Inception), Interstellar  ");
            System.out.println("stars Oscar winner Matthew McConaughey (Dallas Buyers Club), Oscar winner Anne Hathaway  ");
            System.out.println("(Les Misérables), Oscar nominee Jessica Chastain (Zero Dark Thirty), Bill Irwin ");
            System.out.println("(Rachel Getting Married), Oscar winner Ellen Burstyn (Alice Doesn't Live Here Anymore),");
            System.out.println("and Oscar winner Michael Caine (The Cider House Rules). The main cast also includes ");
            System.out.println("Wes Bentley, Casey Affleck, David Gyasi, Mackenzie Foy and Topher Grace. ");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 1 hr 27 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 1 hr 27 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }  
    }

    void martian()
    {
        System.out.println("THE MARTIAN : ");
        System.out.println("Size - 1.78 GB ");
        System.out.println("Total no. of Downloads - 2 Million + ");
        System.out.println("Rating - 4.7       +");
        System.out.println("Cost - 218.00 Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                        The Martian                      ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("From legendary director Ridley Scott (Alien, Prometheus) comes a gripping tale of human strength");
            System.out.println("and the will to survive. During a mission to Mars, American astronaut Mark Watney (Matt Damon)");
            System.out.println("is presumed dead and left behind. But Watney is still alive. Against all odds, he must find");
            System.out.println("a way to contact Earth in the hope that scientists can devise a rescue plan to bring him home. ");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 2 hrs");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 2 hrs");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void gravity()
    {
        System.out.println("GRAVITY : ");
        System.out.println("Size - 1.80 GB ");
        System.out.println("Total no. of Downloads - 5 Million + ");
        System.out.println("Rating - 4.5       +");
        System.out.println("Cost - 140.00 Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                          Gravity                      ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Sandra Bullock and George Clooney star in this heart-pounding thriller written, set in the ");
            System.out.println(" infinite and unforgiving realm of deep space. Bullock plays a brilliant medical engineer on her");
            System.out.println("first shuttle mission, with Clooney as a veteran astronaut in command of his last flight before");
            System.out.println("retiring. But on a seemingly routine spacewalk, disaster strikes. The shuttle is destroyed, ");
            System.out.println("leaving the two completely alone -- tethered to nothing but each other and spiraling out into");
            System.out.println("the blackness. The deafening silence tells them they have lost any link to Earth...and any ");
            System.out.println("chance for rescue. As fear turns to panic, every gulp of air eats away at what little oxygen ");
            System.out.println("is left. But the only way home may be to go further out into the terrifying expanse of space.");     
            System.out.println("");
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 1hr 19 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 1 hr 19 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }  
    }

    void armageddon()
    {
        System.out.println("ARMAGEDDON : ");
        System.out.println("Size - 1.27 GB ");
        System.out.println("Total no. of Downloads - 500 Thousand + ");
        System.out.println("Rating - 4.5       +");
        System.out.println("Cost - 169.00 Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                        Armageddon                       ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("From the blockbuster-making team who produced and directed PEARL HARBOR and THE ROCK ");
            System.out.println(" (Jerry Bruckheimer and Michael Bay) comes the biggest movie of 1998 -- ARMAGEDDON! Starring the ");
            System.out.println(" explosive talents of Bruce Willis (DIE HARD), Academy Award(R)-winners Ben Affleck (GOOD WILL HUNTING)");
            System.out.println(" and Billy Bob Thornton (SLING BLADE), Liv Tyler (THE LORD OF THE RINGS trilogy), Steve Buscemi");
            System.out.println("(CON AIR), and Will Patton (GONE IN 60 SECONDS), ARMAGEDDON is a meteor storm of action-adventure");
            System.out.println("moviemaking that has you on the edge of your seat forgetting to breathe! When NASA's ");
            System.out.println(" executive director, Dan Truman (Thornton), realizes the Earth has 18 days before it's");
            System.out.println("obliterated by a meteor the size of Texas");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 1 hr 18 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 1 hr 08 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }

    void automata()
    {
        System.out.println("AUTOMATA : ");
        System.out.println("Size - 1.07 GB ");
        System.out.println("Total no. of Downloads - 500 Thousand + ");
        System.out.println("Rating - 4.4       +");
        System.out.println("Cost - 174.00 Rs.");
        System.out.println("Type MORE to Learn More about this Movie ");
        System.out.println("Type DOWNLOAD to Download this Movie");
        System.out.println("Press any other Button and then Enter to Go Back");
        str= in.next();
        bvar1= str.equalsIgnoreCase(more);
        bvar2=str.equalsIgnoreCase(down);
        System.out.println("");
        if(bvar1==true)
        {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                                          Automata                      ");
            System.out.println("╚══════════════════════════════════════════════════╝ ");
            System.out.println("Auto Mata In a future where Earth's ecosystem verges on collapse, man-made robots roam the cities");
            System.out.println("to protect dwindling human life. When a robot overrides a key protocol put in place to protect");
            System.out.println("human life, ROC Robotics insurance agent Jacq Vaucan (Antonio Banderas) is assigned to locate");
            System.out.println("the source of the manipulation and eliminate the threat. What he discovers leads Vaucan, ");
            System.out.println("ROC Robotics and the police into a battle with profound consequences for the future of humanity");     
            System.out.println(""); 
            System.out.println("Type DOWNLOAD to Download this Movie");
            System.out.println("Press any other Button and then Enter to Go Back");
            String wrd= in.next();
            boolean opt=wrd.equalsIgnoreCase(down);
            System.out.println("");
            if(opt==true)
            { 
                System.out.println("Downloading     /////////////////////");
                System.out.println("");
                System.out.println("");
                System.out.println("You can Play this Movie in your Device after 1 hr 5 mins");
                System.out.println("Thank you for choosing our Movie");
                System.out.println("==================================================================================================================");
                for(long tl=0;tl<=18000000L;tl++)
                {
                    System.out.print("");
                }
            }

        }
        else if(bvar2==true)
        {
            System.out.println("Downloading     /////////////////////");                               
            System.out.println("");
            System.out.println("You can Play this Movie in your Device after 1 hr 5 mins");
            System.out.println("Thank you for choosing our Movie");
            System.out.println("=========================================================================================================================");
            for(long tl=0;tl<=18000000L;tl++)
            {
                System.out.print("");
            }
        }
    }
}