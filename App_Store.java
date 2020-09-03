import java.util.*;
public class App_Store
{
    Scanner in =new Scanner (System.in);    
    int rpeat=1;
    int flag=0,flag0=0,flag1=0,flag2=0,flag3=0,flag4=0,flag5=0;
    String more="MORE";
    String down="DOWNLOAD";
    String str="";
    boolean bvar1,bvar2;
    public void main()
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
        System.out.println("                                   Welcome to The App Store(It All Starts Here)");
        while(rpeat>0)
        {
            System.out.println("                        Please Enter 1 if you want to download Apps");
            System.out.println("                        Please Enter 2 if you want to download Movies");
            System.out.println("                        Please Enter 3 if you want to download Games");
            System.out.println("                        Please Enter 4 if you want to download Books");
            System.out.println("                        Please Enter 5 if you want to use Search Button");
            System.out.println("                        Please Enter your choice as 6 if you want to Exit ");
            int choice = in.nextInt();
            switch(choice)
            {
                case 1:
                while(rpeat>0)
                {
                    jury:
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                      Whatsapp                                              ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                }
                                break;
                                case 2:
                                System.out.println("FACEBOOK LITE :");
                                System.out.println("Size - 21.07 MB");
                                System.out.println("Total no. of Downloads - 1 Billion +");
                                System.out.println("Rating - 4.7      +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                    Facebook Lite                                         ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                        System.out.println("You can Install this App in your Device after 32 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
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
                                    System.out.println("You can Install this App in your Device after 32 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                }
                                break;
                                case 3:
                                System.out.println("INSTAGRAM : ");
                                System.out.println("Size - 24.30 MB ");
                                System.out.println("Total no. of Downloads - 1.5 Billion + ");
                                System.out.println("Rating - 4.4      +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                      Instagram                                           ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                        System.out.println("You can Install this App in your Device after 37 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
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
                                    System.out.println("You can Install this App in your Device after 37 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                }
                                break;
                                case 4:
                                System.out.println("SHAREIT : ");
                                System.out.println("Size - 8.08 MB ");
                                System.out.println("Total no. of Downloads - 2 Million + ");
                                System.out.println("Rating - 4.3      +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                     ShareIt                                                  ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                }
                                break;
                                case 5:
                                System.out.println("MESSENGER : ");
                                System.out.println("Size - 12.01 MB ");
                                System.out.println("Total no. of Downloads - 1.5 Billion + ");
                                System.out.println("Rating - 4.5      +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                     Messenger                                                 ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                     MX Player                                           ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                PowerAmp Music Palyer                                    ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                   Flight Radar                                          ");
                                    System.out.println("╚══════════════════════════════════════════════════╝");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                   Nova Launcher                                           ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                        System.out.println("You can Install this App in your Device after 27 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
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
                                    System.out.println("You can Install this App in your Device after 27 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                  Our Groceries Key                                    ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                        System.out.println("You can Install this App in your Device after 26 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
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
                                    System.out.println("You can Install this App in your Device after 26 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                   Hike Messenger                                           ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                        System.out.println("You can Install this App in your Device after 29 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
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
                                    System.out.println("You can Install this App in your Device after 29 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                }
                                break;
                                case 2:
                                System.out.println("RETRICA : ");
                                System.out.println("Size - 12.50 MB ");
                                System.out.println("Total no. of Downloads - 2 Million + ");
                                System.out.println("Rating - 4.6      +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                      Retrica                                        ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                }
                                break;
                                case 3:
                                System.out.println("DUOLINGO : ");
                                System.out.println("Size - 32.33 MB ");
                                System.out.println("Total no. of Downloads - 1 Million + ");
                                System.out.println("Rating - 4.4      +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                     DuoLingo                                             ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                        System.out.println("You can Install this App in your Device after 39 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
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
                                    System.out.println("You can Install this App in your Device after 39 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                }
                                break;
                                case 4:
                                System.out.println("HOTSTAR : ");
                                System.out.println("Size - 44.23 MB ");
                                System.out.println("Total no. of Downloads - 2 Million + ");
                                System.out.println("Rating - 4.6      +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                       Hotstar                                        ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                        System.out.println("You can Install this App in your Device after 50 mins");
                                        System.out.println("Thank you for choosing our App");
                                        System.out.println("==================================================================================================================");
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
                                    System.out.println("You can Install this App in your Device after 50 mins");
                                    System.out.println("Thank you for choosing our App");
                                    System.out.println("=========================================================================================================================");
                                }
                                break;
                                case 5:
                                System.out.println("XENDER : ");
                                System.out.println("Size - 8.56 MB ");
                                System.out.println("Total no. of Downloads - 500 Thousand + ");
                                System.out.println("Rating - 4.7      +");
                                System.out.println("Type MORE to Learn More about this app ");
                                System.out.println("Type DOWNLOAD to Download this app");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                          Xender                                    ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                    Candy Camera                                         ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 2:
                                        System.out.println("PIXLR : ");
                                        System.out.println("Size - 9.75 MB ");
                                        System.out.println("Total no. of Downloads - 1 Million + ");
                                        System.out.println("Rating - 4.7      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Pixlr                                       ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 3:
                                        System.out.println("INSTAGRAM : ");
                                        System.out.println("Size - 24.30 MB ");
                                        System.out.println("Total no. of Downloads - 1.5 Billion + ");
                                        System.out.println("Rating - 4.4      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Instagram                                           ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                                System.out.println("You can Install this App in your Device after 37 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Install this App in your Device after 37 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                        }
                                        break;
                                        case 4:
                                        System.out.println("RETRICA : ");
                                        System.out.println("Size - 12.50 MB ");
                                        System.out.println("Total no. of Downloads - 2 Million + ");
                                        System.out.println("Rating - 4.6      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Retrica                                        ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 5:
                                        System.out.println("PIC COLLAGE : ");
                                        System.out.println("Size - 10.40 MB ");
                                        System.out.println("Total no. of Downloads - 1 Million + ");
                                        System.out.println("Rating - 4.5      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                        Pic Collage                                     ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                         Saavn                                      ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 2:
                                        System.out.println("Gaana : ");
                                        System.out.println("Size - 23.11 MB ");
                                        System.out.println("Total no. of Downloads - 1 Million + ");
                                        System.out.println("Rating - 4.7      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                             Gaana                                ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                                System.out.println("You can Install this App in your Device after 34 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Install this App in your Device after 34 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                        }
                                        break;
                                        case 3:
                                        System.out.println("WYNK MUSIC : ");
                                        System.out.println("Size - 21.91 MB ");
                                        System.out.println("Total no. of Downloads - 1 Millilon + ");
                                        System.out.println("Rating - 4.6      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Wynk Music                                         ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                                System.out.println("You can Install this App in your Device after 31 mins");
                                                System.out.println("Thank you for choosing our App");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Install this App in your Device after 31 mins");
                                            System.out.println("Thank you for choosing our App");
                                            System.out.println("=========================================================================================================================");
                                        }
                                        break;
                                        case 4:
                                        System.out.println("SHAZAM : ");
                                        System.out.println("Size - 15.98 MB ");
                                        System.out.println("Total no. of Downloads - 200 Thousand + ");
                                        System.out.println("Rating - 4.7      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                          Shazam                                    ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 5:
                                        System.out.println("HUNGAMA : ");
                                        System.out.println("Size - 18.0 MB ");
                                        System.out.println("Total no. of Downloads - 100 Thousand + ");
                                        System.out.println("Rating - 4.3      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                                                             ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                    Amazon India                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 2:
                                        System.out.println("FLIPKART : ");
                                        System.out.println("Size - 24.70 MB ");
                                        System.out.println("Total no. of Downloads - 5 Million + ");
                                        System.out.println("Rating - 4.4      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Flipkart                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 3:
                                        System.out.println("JABONG : ");
                                        System.out.println("Size - 21.50 MB ");
                                        System.out.println("Total no. of Downloads - 500 Thousand + ");
                                        System.out.println("Rating - 4.2      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                           Jabong                                  ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 4:
                                        System.out.println("MYNTRA : ");
                                        System.out.println("Size - 16.94 MB ");
                                        System.out.println("Total no. of Downloads - 2 Million + ");
                                        System.out.println("Rating - 4.7      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                        Myntra                                     ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 5:
                                        System.out.println("OLX : ");
                                        System.out.println("Size - 19.67 MB ");
                                        System.out.println("Total no. of Downloads - 500 Thousand + ");
                                        System.out.println("Rating - 4.6      +");
                                        System.out.println("Type MORE to Learn More about this app ");
                                        System.out.println("Type DOWNLOAD to Download this app");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                          OLX                                         ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                       Furious 7                                     ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                       Jurrasic World                                 ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                       Big Hero 6                                ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                   Mission Impossible 5                             ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                          Drishyam                                ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                            Fan                           ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                          Batman vs Superman                             ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                    Kapoor And Sons                                   ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                       KingsMan                                ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                      Civil War                                 ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                     Bombay to Goa                                 ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                     Dhammal                                 ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                         Bangistan                                 ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Welcome Back                                ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                   Welcome 2 Karachi                                ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                        Pizza                                ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                           13 B                       ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      The Exorcist                       ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                         Annabelle                                ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                           The Conjuring                       ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                    System.out.println("4.Armeggedon      - 4.5");
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                         Interstellar                      ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                        The Martian                      ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                          Gravity                      ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 4:
                                        System.out.println("ARMEGGEDON : ");
                                        System.out.println("Size - 1.27 GB ");
                                        System.out.println("Total no. of Downloads - 500 Thousand + ");
                                        System.out.println("Rating - 4.5       +");
                                        System.out.println("Cost - 169.00 Rs.");
                                        System.out.println("Type MORE to Learn More about this Movie ");
                                        System.out.println("Type DOWNLOAD to Download this Movie");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                        Armeggedon                       ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                          Automata                      ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                            System.out.println("4.Clash of Kings         -4.0");
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                   Candy Crush Saga                             ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                }
                                break;
                                case 2:
                                System.out.println("CLASH OF CLANS : ");
                                System.out.println("Size - 58.79 MB ");
                                System.out.println("Total no. of Downloads - 1 Billion + ");
                                System.out.println("Rating - 4.4       +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                      Clash of Clans                         ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                }
                                break;
                                case 3:
                                System.out.println("TEEN PATTI ULTIMATE : ");
                                System.out.println("Size - 34.56 MB ");
                                System.out.println("Total no. of Downloads - 1 Billion + ");
                                System.out.println("Rating - 4.3      +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                    Teen Patti Ultimate                       ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                }
                                break;
                                case 4:
                                System.out.println("CLASH OF KINGS : ");
                                System.out.println("Size - 53.91 MB ");
                                System.out.println("Total no. of Downloads - 1 Million + ");
                                System.out.println("Rating - 4.0       +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                    Clash of Kings                            ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                }
                                break;
                                case 5:
                                System.out.println("CLASH ROYALE : ");
                                System.out.println("Size - 87.89 MB ");
                                System.out.println("Total no. of Downloads - 5 Million + ");
                                System.out.println("Rating - 4.2       +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                       Clash Royale                       ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                        Lost Journey                      ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                        MineCraft                        ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                     Mind Games Pro                           ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                The Dark Knight Rises                                ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                     The LEGO Game                           ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                Teen Patti- Indian Pokar                                ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                }
                                break;
                                case 2:
                                System.out.println("CLASH OF CLANS : ");
                                System.out.println("Size - 58 MB ");
                                System.out.println("Total no. of Downloads - 2 Billion + ");
                                System.out.println("Rating - 4.4       +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                        Clash of Clans                       ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                }
                                break;
                                case 3:
                                System.out.println("HAY DAY : ");
                                System.out.println("Size - 30.88 MB ");
                                System.out.println("Total no. of Downloads -  Thousand + ");
                                System.out.println("Rating - 4.1       +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                         Hay Day                       ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                }
                                break;
                                case 4:
                                System.out.println("SUBWAY SURFERS PRAGUE : ");
                                System.out.println("Size - 16.89 MB ");
                                System.out.println("Total no. of Downloads - 2 Billion  + ");
                                System.out.println("Rating - 4.5       +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                   Subway Surfers Prague                       ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                }
                                break;
                                case 5:
                                System.out.println("CLASH ROYALE : ");
                                System.out.println("Size - 87.02 MB ");
                                System.out.println("Total no. of Downloads - 10 Million + ");
                                System.out.println("Rating - 4.2       +");
                                System.out.println("Type MORE to Learn More about this Game ");
                                System.out.println("Type DOWNLOAD to Download this Game");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                     Clash Royale                     ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
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
                                    System.out.println("3.Dragon Mania     - 4.4 ");
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Dragon City                        ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 2:
                                        System.out.println("CLASH OF CLANS : ");
                                        System.out.println("Size - 58.79 MB ");
                                        System.out.println("Total no. of Downloads - 1 Billion + ");
                                        System.out.println("Rating - 4.4       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Clash of Clans                         ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 3:
                                        System.out.println("DRAGON MANIA : ");
                                        System.out.println("Size - 37.79 MB ");
                                        System.out.println("Total no. of Downloads - 1 Billion + ");
                                        System.out.println("Rating - 4.4       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Dragon Mania                         ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 4:
                                        System.out.println("CLASH ROYALE : ");
                                        System.out.println("Size - 87.89 MB ");
                                        System.out.println("Total no. of Downloads - 5 Million + ");
                                        System.out.println("Rating - 4.2       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                       Clash Royale                       ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 5:
                                        System.out.println("HAY DAY : ");
                                        System.out.println("Size - 68.90 MB ");
                                        System.out.println("Total no. of Downloads - 5 Million + ");
                                        System.out.println("Rating - 4.5       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Hay Day                       ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                    System.out.println("4.PK-The Game      - 4.2");
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Temple Run 2                     ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 2:
                                        System.out.println("FAN-THE GAME : ");
                                        System.out.println("Size - 7.90 MB ");
                                        System.out.println("Total no. of Downloads - 5 Million + ");
                                        System.out.println("Rating - 4.4       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Fan-The Game                    ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 3:
                                        System.out.println("KILOO & SYBO : ");
                                        System.out.println("Size - 17.90 MB ");
                                        System.out.println("Total no. of Downloads - 5 Million + ");
                                        System.out.println("Rating - 4.4       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Kiloo & Sybo                   ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 4:
                                        System.out.println("PK-THE GAME : ");
                                        System.out.println("Size - 6.90 MB ");
                                        System.out.println("Total no. of Downloads - 1 Million + ");
                                        System.out.println("Rating - 4.2       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      PK-The Game                    ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 5:
                                        System.out.println("SUBWAY SURFERS : ");
                                        System.out.println("Size - 19.90 MB ");
                                        System.out.println("Total no. of Downloads - 10 Million + ");
                                        System.out.println("Rating - 4.5       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Subway Surfers                    ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                    System.out.println("2.Street Fight      - 4.4 ");
                                    System.out.println("3.Tekken            - 4.4 ");
                                    System.out.println("4.The Real Fighting - 4.2");
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
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Shadow Fight 2                    ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 2:
                                        System.out.println("STREET FIGHT  : ");
                                        System.out.println("Size - 10.78 MB ");
                                        System.out.println("Total no. of Downloads - 2 Million + ");
                                        System.out.println("Rating - 4.4       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                       Street Fight                     ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 3:
                                        System.out.println("TEKKEN : ");
                                        System.out.println("Size - 38.0 MB ");
                                        System.out.println("Total no. of Downloads - 5 Million + ");
                                        System.out.println("Rating - 4.4       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                        Tekken                    ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 4:
                                        System.out.println("THE REAL FIGHITING : ");
                                        System.out.println("Size - 14.78 MB ");
                                        System.out.println("Total no. of Downloads - 2.5 Million + ");
                                        System.out.println("Rating - 4.2       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                    The Real Fighiting                   ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                                        }
                                        break;
                                        case 5:
                                        System.out.println("MORTAL KOMBAT X : ");
                                        System.out.println("Size - 58.78 MB ");
                                        System.out.println("Total no. of Downloads - 10 Million + ");
                                        System.out.println("Rating - 4.5       +");
                                        System.out.println("Type MORE to Learn More about this Game ");
                                        System.out.println("Type DOWNLOAD to Download this Game");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                      Mortal Kombat X                    ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
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
                while(rpeat>0)
                {
                    System.out.println("Under which Category do you want to Check for your Book to be Downloaded");
                    System.out.println("1. Top Selling");
                    System.out.println("2. New Releases");
                    System.out.println("3. Categories");
                    System.out.println("4. Back to Home");
                    System.out.println("5. Exit");
                    System.out.println("Please Enter Your Choice:");
                    int choice4 = in.nextInt();
                    switch(choice4)
                    {
                        case 1:
                        while(rpeat>0)
                        {
                            System.out.println("Welcome to the TOP SELLING Menu of Books");
                            System.out.println("Here's the list of Books:");
                            System.out.println("  Book Name:                  Rating:");
                            System.out.println("1.The Immortals of Meluha    -4.7");
                            System.out.println("2.In Search of Double Helix  -4.6");
                            System.out.println("3.The Chariots of God        -4.2");
                            System.out.println("4.The Da Vinci Code          -4.5");
                            System.out.println("5.The Diary of a Wimpy Kid   -4.4");
                            System.out.println("6.Back ");
                            System.out.println("7.Back To Home");
                            System.out.println("8.Exit");
                            System.out.println("Please Enter Your Choice:");
                            int i=in.nextInt();
                            switch(i)
                            {
                                case 1:
                                System.out.println(" : ");
                                System.out.println("Size -  MB ");
                                System.out.println("Total no. of Downloads -  Million + ");
                                System.out.println("Rating - 4.       +");
                                System.out.println("Cost -  Rs.");
                                System.out.println("Type MORE to Learn More about this Book ");
                                System.out.println("Type DOWNLOAD to Download this Book");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                                          ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println("");
                                    System.out.println("Type DOWNLOAD to Download this Book");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Read this Book in your Device after  mins");
                                        System.out.println("Thank you for choosing our Book");
                                        System.out.println("==================================================================================================================");
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
                                    System.out.println("You can Read this Book in your Device after  mins");
                                    System.out.println("Thank you for choosing our Book");
                                    System.out.println("=========================================================================================================================");
                                }
                                break;
                                case 2:
                                System.out.println(" : ");
                                System.out.println("Size -  MB ");
                                System.out.println("Total no. of Downloads -  Million + ");
                                System.out.println("Rating - 4.       +");
                                System.out.println("Cost -  Rs.");
                                System.out.println("Type MORE to Learn More about this Book ");
                                System.out.println("Type DOWNLOAD to Download this Book");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                                          ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println("");
                                    System.out.println("Type DOWNLOAD to Download this Book");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Read this Book in your Device after  mins");
                                        System.out.println("Thank you for choosing our Book");
                                        System.out.println("==================================================================================================================");
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
                                    System.out.println("You can Read this Book in your Device after  mins");
                                    System.out.println("Thank you for choosing our Book");
                                    System.out.println("=========================================================================================================================");
                                }
                                break;
                                case 3:
                                System.out.println(" : ");
                                System.out.println("Size -  MB ");
                                System.out.println("Total no. of Downloads -  Million + ");
                                System.out.println("Rating - 4.       +");
                                System.out.println("Cost -  Rs.");
                                System.out.println("Type MORE to Learn More about this Book ");
                                System.out.println("Type DOWNLOAD to Download this Book");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                                          ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println("");
                                    System.out.println("Type DOWNLOAD to Download this Book");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Read this Book in your Device after  mins");
                                        System.out.println("Thank you for choosing our Book");
                                        System.out.println("==================================================================================================================");
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
                                    System.out.println("You can Read this Book in your Device after  mins");
                                    System.out.println("Thank you for choosing our Book");
                                    System.out.println("=========================================================================================================================");
                                }
                                break;
                                case 4:
                                System.out.println(" : ");
                                System.out.println("Size -  MB ");
                                System.out.println("Total no. of Downloads -  Million + ");
                                System.out.println("Rating - 4.       +");
                                System.out.println("Cost -  Rs.");
                                System.out.println("Type MORE to Learn More about this Book ");
                                System.out.println("Type DOWNLOAD to Download this Book");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                                          ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println("");
                                    System.out.println("Type DOWNLOAD to Download this Book");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Read this Book in your Device after  mins");
                                        System.out.println("Thank you for choosing our Book");
                                        System.out.println("==================================================================================================================");
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
                                    System.out.println("You can Read this Book in your Device after  mins");
                                    System.out.println("Thank you for choosing our Book");
                                    System.out.println("=========================================================================================================================");
                                }
                                break;
                                case 5:
                                System.out.println(" : ");
                                System.out.println("Size -  MB ");
                                System.out.println("Total no. of Downloads -  Million + ");
                                System.out.println("Rating - 4.       +");
                                System.out.println("Cost -  Rs.");
                                System.out.println("Type MORE to Learn More about this Book ");
                                System.out.println("Type DOWNLOAD to Download this Book");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                                          ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println("");
                                    System.out.println("Type DOWNLOAD to Download this Book");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Read this Book in your Device after  mins");
                                        System.out.println("Thank you for choosing our Book");
                                        System.out.println("==================================================================================================================");
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
                                    System.out.println("You can Read this Book in your Device after  mins");
                                    System.out.println("Thank you for choosing our Book");
                                    System.out.println("=========================================================================================================================");
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
                            System.out.println("Welcome to the NEW RELEASES Menu of Books");
                            System.out.println("Here's the list of Books:");
                            System.out.println("  Book Name:                Rating:");
                            System.out.println("1.The Martian              -4.7");
                            System.out.println("2.Room                     -4.4");
                            System.out.println("3.Mad Max:Fury Road        -4.5");
                            System.out.println("4.The Revenant             -4.8");
                            System.out.println("5.The Fault in our Stars   -4.6");
                            System.out.println("6.Back ");
                            System.out.println("7.Back To Home");
                            System.out.println("8.Exit");
                            System.out.println("Please Enter Your Choice:");
                            int i=in.nextInt();
                            switch(i)
                            {
                                case 1:
                                System.out.println(" : ");
                                System.out.println("Size -  MB ");
                                System.out.println("Total no. of Downloads -  Million + ");
                                System.out.println("Rating - 4.       +");
                                System.out.println("Cost -  Rs.");
                                System.out.println("Type MORE to Learn More about this Book ");
                                System.out.println("Type DOWNLOAD to Download this Book");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                                          ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println("");
                                    System.out.println("Type DOWNLOAD to Download this Book");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Read this Book in your Device after  mins");
                                        System.out.println("Thank you for choosing our Book");
                                        System.out.println("==================================================================================================================");
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
                                    System.out.println("You can Read this Book in your Device after  mins");
                                    System.out.println("Thank you for choosing our Book");
                                    System.out.println("=========================================================================================================================");
                                }
                                break;
                                case 2:
                                System.out.println(" : ");
                                System.out.println("Size -  MB ");
                                System.out.println("Total no. of Downloads -  Million + ");
                                System.out.println("Rating - 4.       +");
                                System.out.println("Cost -  Rs.");
                                System.out.println("Type MORE to Learn More about this Book ");
                                System.out.println("Type DOWNLOAD to Download this Book");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                                          ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println("");
                                    System.out.println("Type DOWNLOAD to Download this Book");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Read this Book in your Device after  mins");
                                        System.out.println("Thank you for choosing our Book");
                                        System.out.println("==================================================================================================================");
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
                                    System.out.println("You can Read this Book in your Device after  mins");
                                    System.out.println("Thank you for choosing our Book");
                                    System.out.println("=========================================================================================================================");
                                }
                                break;
                                case 3:
                                System.out.println(" : ");
                                System.out.println("Size -  MB ");
                                System.out.println("Total no. of Downloads -  Million + ");
                                System.out.println("Rating - 4.       +");
                                System.out.println("Cost -  Rs.");
                                System.out.println("Type MORE to Learn More about this Book ");
                                System.out.println("Type DOWNLOAD to Download this Book");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                                          ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println("");
                                    System.out.println("Type DOWNLOAD to Download this Book");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Read this Book in your Device after  mins");
                                        System.out.println("Thank you for choosing our Book");
                                        System.out.println("==================================================================================================================");
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
                                    System.out.println("You can Read this Book in your Device after  mins");
                                    System.out.println("Thank you for choosing our Book");
                                    System.out.println("=========================================================================================================================");
                                }
                                break;
                                case 4:
                                System.out.println(" : ");
                                System.out.println("Size -  MB ");
                                System.out.println("Total no. of Downloads -  Million + ");
                                System.out.println("Rating - 4.       +");
                                System.out.println("Cost -  Rs.");
                                System.out.println("Type MORE to Learn More about this Book ");
                                System.out.println("Type DOWNLOAD to Download this Book");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                                          ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println("");
                                    System.out.println("Type DOWNLOAD to Download this Book");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Read this Book in your Device after  mins");
                                        System.out.println("Thank you for choosing our Book");
                                        System.out.println("==================================================================================================================");
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
                                    System.out.println("You can Read this Book in your Device after  mins");
                                    System.out.println("Thank you for choosing our Book");
                                    System.out.println("=========================================================================================================================");
                                }
                                break;
                                case 5:
                                System.out.println(" : ");
                                System.out.println("Size -  MB ");
                                System.out.println("Total no. of Downloads -  Million + ");
                                System.out.println("Rating - 4.       +");
                                System.out.println("Cost -  Rs.");
                                System.out.println("Type MORE to Learn More about this Book ");
                                System.out.println("Type DOWNLOAD to Download this Book");
                                str= in.next();
                                bvar1= str.equalsIgnoreCase(more);
                                bvar2=str.equalsIgnoreCase(down);
                                System.out.println("");
                                if(bvar1==true)
                                {
                                    System.out.println("╔══════════════════════════════════════════════════╗");
                                    System.out.println("                                                          ");
                                    System.out.println("╚══════════════════════════════════════════════════╝ ");
                                    System.out.println("");     
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println(""); 
                                    System.out.println("");
                                    System.out.println("Type DOWNLOAD to Download this Book");
                                    System.out.println("Press any other Button and then Enter to Go Back");
                                    String wrd= in.next();
                                    boolean opt=wrd.equalsIgnoreCase(down);
                                    System.out.println("");
                                    if(opt==true)
                                    { 
                                        System.out.println("Downloading     /////////////////////");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("You can Read this Book in your Device after  mins");
                                        System.out.println("Thank you for choosing our Book");
                                        System.out.println("==================================================================================================================");
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
                                    System.out.println("You can Read this Book in your Device after  mins");
                                    System.out.println("Thank you for choosing our Book");
                                    System.out.println("=========================================================================================================================");
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
                        case 3:
                        while(rpeat>0)
                        {
                            System.out.println("Welcome to the CATEGORIES Menu of Books");
                            System.out.println("Here's your list of Categories:");
                            System.out.println("1.Comics");
                            System.out.println("2.Story Books");
                            System.out.println("3.Adventure Books");
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
                                    System.out.println("Welcome to the Menu of Comic Books");
                                    System.out.println("Here's the list of Books:");
                                    System.out.println("  Book Name:         Rating:");
                                    System.out.println("1.DC Comics        - 4.6 ");
                                    System.out.println("2.Bavri            - 4.4 ");
                                    System.out.println("3.Chacha Chaudhri  - 4.4 ");
                                    System.out.println("4.Phantom          - 4.2");
                                    System.out.println("5.Chintu           - 4.5");
                                    System.out.println("6.Back ");
                                    System.out.println("7.Back To Home");
                                    System.out.println("8.Exit");
                                    System.out.println("Please Enter Your Choice:");
                                    i=in.nextInt();
                                    switch(i)
                                    {
                                        case 1:
                                        System.out.println(" : ");
                                        System.out.println("Size -  MB ");
                                        System.out.println("Total no. of Downloads -  Million + ");
                                        System.out.println("Rating - 4.       +");
                                        System.out.println("Cost -  Rs.");
                                        System.out.println("Type MORE to Learn More about this Book ");
                                        System.out.println("Type DOWNLOAD to Download this Book");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this Book");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Read this Book in your Device after  mins");
                                                System.out.println("Thank you for choosing our Book");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Read this Book in your Device after  mins");
                                            System.out.println("Thank you for choosing our Book");
                                            System.out.println("=========================================================================================================================");
                                        }
                                        break;
                                        case 2:
                                        System.out.println(" : ");
                                        System.out.println("Size -  MB ");
                                        System.out.println("Total no. of Downloads -  Million + ");
                                        System.out.println("Rating - 4.       +");
                                        System.out.println("Cost -  Rs.");
                                        System.out.println("Type MORE to Learn More about this Book ");
                                        System.out.println("Type DOWNLOAD to Download this Book");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this Book");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Read this Book in your Device after  mins");
                                                System.out.println("Thank you for choosing our Book");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Read this Book in your Device after  mins");
                                            System.out.println("Thank you for choosing our Book");
                                            System.out.println("=========================================================================================================================");
                                        }
                                        break;
                                        case 3:
                                        System.out.println(" : ");
                                        System.out.println("Size -  MB ");
                                        System.out.println("Total no. of Downloads -  Million + ");
                                        System.out.println("Rating - 4.       +");
                                        System.out.println("Cost -  Rs.");
                                        System.out.println("Type MORE to Learn More about this Book ");
                                        System.out.println("Type DOWNLOAD to Download this Book");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this Book");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Read this Book in your Device after  mins");
                                                System.out.println("Thank you for choosing our Book");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Read this Book in your Device after  mins");
                                            System.out.println("Thank you for choosing our Book");
                                            System.out.println("=========================================================================================================================");
                                        }
                                        break;
                                        case 4:
                                        System.out.println(" : ");
                                        System.out.println("Size -  MB ");
                                        System.out.println("Total no. of Downloads -  Million + ");
                                        System.out.println("Rating - 4.       +");
                                        System.out.println("Cost -  Rs.");
                                        System.out.println("Type MORE to Learn More about this Book ");
                                        System.out.println("Type DOWNLOAD to Download this Book");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this Book");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Read this Book in your Device after  mins");
                                                System.out.println("Thank you for choosing our Book");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Read this Book in your Device after  mins");
                                            System.out.println("Thank you for choosing our Book");
                                            System.out.println("=========================================================================================================================");
                                        }
                                        break;
                                        case 5:
                                        System.out.println(" : ");
                                        System.out.println("Size -  MB ");
                                        System.out.println("Total no. of Downloads -  Million + ");
                                        System.out.println("Rating - 4.       +");
                                        System.out.println("Cost -  Rs.");
                                        System.out.println("Type MORE to Learn More about this Book ");
                                        System.out.println("Type DOWNLOAD to Download this Book");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this Book");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Read this Book in your Device after  mins");
                                                System.out.println("Thank you for choosing our Book");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Read this Book in your Device after  mins");
                                            System.out.println("Thank you for choosing our Book");
                                            System.out.println("=========================================================================================================================");
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
                                case 2:
                                while(rpeat>0)
                                {
                                    System.out.println("Welcome to the Menu of Story Books");
                                    System.out.println("Here's the list of Books:");
                                    System.out.println("  Book Name:             Rating:");
                                    System.out.println("1.Panchatantra         - 4.6 ");
                                    System.out.println("2.Hardy Boys           - 4.4 ");
                                    System.out.println("3.The Diary Wimpy Kid  - 4.4 ");
                                    System.out.println("4.Geronimo Stilton     - 4.2");
                                    System.out.println("5.The Grandma's Tales  - 4.5");
                                    System.out.println("6.Back ");
                                    System.out.println("7.Back To Home");
                                    System.out.println("8.Exit");
                                    System.out.println("Please Enter Your Choice:");
                                    i=in.nextInt();
                                    switch(i)
                                    {
                                        case 1:
                                        System.out.println(" : ");
                                        System.out.println("Size -  MB ");
                                        System.out.println("Total no. of Downloads -  Million + ");
                                        System.out.println("Rating - 4.       +");
                                        System.out.println("Cost -  Rs.");
                                        System.out.println("Type MORE to Learn More about this Book ");
                                        System.out.println("Type DOWNLOAD to Download this Book");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this Book");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Read this Book in your Device after  mins");
                                                System.out.println("Thank you for choosing our Book");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Read this Book in your Device after  mins");
                                            System.out.println("Thank you for choosing our Book");
                                            System.out.println("=========================================================================================================================");
                                        }
                                        break;
                                        case 2:
                                        System.out.println(" : ");
                                        System.out.println("Size -  MB ");
                                        System.out.println("Total no. of Downloads -  Million + ");
                                        System.out.println("Rating - 4.       +");
                                        System.out.println("Cost -  Rs.");
                                        System.out.println("Type MORE to Learn More about this Book ");
                                        System.out.println("Type DOWNLOAD to Download this Book");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this Book");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Read this Book in your Device after  mins");
                                                System.out.println("Thank you for choosing our Book");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Read this Book in your Device after  mins");
                                            System.out.println("Thank you for choosing our Book");
                                            System.out.println("=========================================================================================================================");
                                        }
                                        break;
                                        case 3:
                                        System.out.println(" : ");
                                        System.out.println("Size -  MB ");
                                        System.out.println("Total no. of Downloads -  Million + ");
                                        System.out.println("Rating - 4.       +");
                                        System.out.println("Cost -  Rs.");
                                        System.out.println("Type MORE to Learn More about this Book ");
                                        System.out.println("Type DOWNLOAD to Download this Book");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this Book");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Read this Book in your Device after  mins");
                                                System.out.println("Thank you for choosing our Book");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Read this Book in your Device after  mins");
                                            System.out.println("Thank you for choosing our Book");
                                            System.out.println("=========================================================================================================================");
                                        }
                                        break;
                                        case 4:
                                        System.out.println(" : ");
                                        System.out.println("Size -  MB ");
                                        System.out.println("Total no. of Downloads -  Million + ");
                                        System.out.println("Rating - 4.       +");
                                        System.out.println("Cost -  Rs.");
                                        System.out.println("Type MORE to Learn More about this Book ");
                                        System.out.println("Type DOWNLOAD to Download this Book");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this Book");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Read this Book in your Device after  mins");
                                                System.out.println("Thank you for choosing our Book");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Read this Book in your Device after  mins");
                                            System.out.println("Thank you for choosing our Book");
                                            System.out.println("=========================================================================================================================");
                                        }
                                        break;
                                        case 5:
                                        System.out.println(" : ");
                                        System.out.println("Size -  MB ");
                                        System.out.println("Total no. of Downloads -  Million + ");
                                        System.out.println("Rating - 4.       +");
                                        System.out.println("Cost -  Rs.");
                                        System.out.println("Type MORE to Learn More about this Book ");
                                        System.out.println("Type DOWNLOAD to Download this Book");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this Book");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Read this Book in your Device after  mins");
                                                System.out.println("Thank you for choosing our Book");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Read this Book in your Device after  mins");
                                            System.out.println("Thank you for choosing our Book");
                                            System.out.println("=========================================================================================================================");
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
                                    System.out.println("Welcome to the Menu of Adventure Books");
                                    System.out.println("Here's the list of Books:");
                                    System.out.println("  Book Name:              Rating:");
                                    System.out.println("1.Sherlock Holmes       - 4.6 ");
                                    System.out.println("2.Famous Five           - 4.4 ");
                                    System.out.println("3.Goosebumps            - 4.4 ");
                                    System.out.println("4.The Secret Seven      - 4.2");
                                    System.out.println("5.The Lords of the Ring - 4.5");
                                    System.out.println("6.Back ");
                                    System.out.println("7.Back To Home");
                                    System.out.println("8.Exit");
                                    System.out.println("Please Enter Your Choice:");
                                    i=in.nextInt();
                                    switch(i)
                                    {
                                        case 1:
                                        System.out.println(" : ");
                                        System.out.println("Size -  MB ");
                                        System.out.println("Total no. of Downloads -  Million + ");
                                        System.out.println("Rating - 4.       +");
                                        System.out.println("Cost -  Rs.");
                                        System.out.println("Type MORE to Learn More about this Book ");
                                        System.out.println("Type DOWNLOAD to Download this Book");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this Book");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Read this Book in your Device after  mins");
                                                System.out.println("Thank you for choosing our Book");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Read this Book in your Device after  mins");
                                            System.out.println("Thank you for choosing our Book");
                                            System.out.println("=========================================================================================================================");
                                        }
                                        break;
                                        case 2:
                                        System.out.println(" : ");
                                        System.out.println("Size -  MB ");
                                        System.out.println("Total no. of Downloads -  Million + ");
                                        System.out.println("Rating - 4.       +");
                                        System.out.println("Cost -  Rs.");
                                        System.out.println("Type MORE to Learn More about this Book ");
                                        System.out.println("Type DOWNLOAD to Download this Book");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this Book");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Read this Book in your Device after  mins");
                                                System.out.println("Thank you for choosing our Book");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Read this Book in your Device after  mins");
                                            System.out.println("Thank you for choosing our Book");
                                            System.out.println("=========================================================================================================================");
                                        }
                                        break;
                                        case 3:
                                        System.out.println(" : ");
                                        System.out.println("Size -  MB ");
                                        System.out.println("Total no. of Downloads -  Million + ");
                                        System.out.println("Rating - 4.       +");
                                        System.out.println("Cost -  Rs.");
                                        System.out.println("Type MORE to Learn More about this Book ");
                                        System.out.println("Type DOWNLOAD to Download this Book");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this Book");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Read this Book in your Device after  mins");
                                                System.out.println("Thank you for choosing our Book");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Read this Book in your Device after  mins");
                                            System.out.println("Thank you for choosing our Book");
                                            System.out.println("=========================================================================================================================");
                                        }
                                        break;
                                        case 4:
                                        System.out.println(" : ");
                                        System.out.println("Size -  MB ");
                                        System.out.println("Total no. of Downloads -  Million + ");
                                        System.out.println("Rating - 4.       +");
                                        System.out.println("Cost -  Rs.");
                                        System.out.println("Type MORE to Learn More about this Book ");
                                        System.out.println("Type DOWNLOAD to Download this Book");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this Book");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Read this Book in your Device after  mins");
                                                System.out.println("Thank you for choosing our Book");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Read this Book in your Device after  mins");
                                            System.out.println("Thank you for choosing our Book");
                                            System.out.println("=========================================================================================================================");
                                        }
                                        break;
                                        case 5:
                                        System.out.println(" : ");
                                        System.out.println("Size -  MB ");
                                        System.out.println("Total no. of Downloads -  Million + ");
                                        System.out.println("Rating - 4.       +");
                                        System.out.println("Cost -  Rs.");
                                        System.out.println("Type MORE to Learn More about this Book ");
                                        System.out.println("Type DOWNLOAD to Download this Book");
                                        str= in.next();
                                        bvar1= str.equalsIgnoreCase(more);
                                        bvar2=str.equalsIgnoreCase(down);
                                        System.out.println("");
                                        if(bvar1==true)
                                        {
                                            System.out.println("╔══════════════════════════════════════════════════╗");
                                            System.out.println("                                                          ");
                                            System.out.println("╚══════════════════════════════════════════════════╝ ");
                                            System.out.println("");     
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println(""); 
                                            System.out.println("");
                                            System.out.println("Type DOWNLOAD to Download this Book");
                                            System.out.println("Press any other Button and then Enter to Go Back");
                                            String wrd= in.next();
                                            boolean opt=wrd.equalsIgnoreCase(down);
                                            System.out.println("");
                                            if(opt==true)
                                            { 
                                                System.out.println("Downloading     /////////////////////");
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("You can Read this Book in your Device after  mins");
                                                System.out.println("Thank you for choosing our Book");
                                                System.out.println("==================================================================================================================");
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
                                            System.out.println("You can Read this Book in your Device after  mins");
                                            System.out.println("Thank you for choosing our Book");
                                            System.out.println("=========================================================================================================================");
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
                                case 4:
                                flag2=1;
                                break;
                                case 5:
                                break;
                                case 6:
                                this.main();
                                break;
                                case 7:
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
                case 5:
                System.out.println("Search");
                break;
                case 6:
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
}
