import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        int rep = 0;
        user obj = new user();
        tracking_system obj_1 = new tracking_system();
        admin obj_2=new admin();
        Scanner num_1 = new Scanner(System.in);
        System.out.println("Welcome to Gaming Computer Shop");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        do {
            System.out.println("1. Register a new account(for new user)");
            System.out.println("2. Login");
            System.out.println("3. Tracking parcel");
            System.out.println("4. Admin(AhLim 0000)");
            System.out.println("5. Exit");
            System.out.print("\n");
            System.out.print("Enter number: ");
            int n = num_1.nextInt();

            switch (n) {
                case 1:
                    obj.register();
                    obj.order();
                    obj.express();
                    obj.display();
                    break;
                case 2:
                    obj.login();
                    obj.order();
                    obj.express();
                    obj.display();
                    break;
                case 3:
                    obj_1.check_ID();
                    break;
                case 4:
                    obj_2.admin();
                    break;
                case 5:
                    System.out.print("\n");
                    System.out.println("Thank you for support our shop");
                    System.out.println("Hope you have a nice a day. BYE BYE");
                    System.exit(0);
                    break;
            }
        } while (rep == 0);
        obj.register();
        obj.register();
        obj_2.remove();
    }
}

    class user {
        static int i, y, z;
        Scanner input = new Scanner(System.in);
        String name, password;
        String l_name, l_password;  //login variable
        static String[] store_name = new String[100];    //store username
        static String[] store_pass = new String[100];    //store password
        static String[] store_com = new String[100];     //store express company
        static int[] Total = new int[100];         //total of price
        static int[] q_1 = new int[100];
        static int[] q_2 = new int[100];
        static int[] q_3 = new int[100];
        static int[] q_4 = new int[100];
        static int[] q_5 = new int[100];
        static int[] q_6 = new int[100];
        String pos_laju = "POS00";
        String jt = "JT00";

        public void register() {
            System.out.println("Registration");
            System.out.println("--------------");
            System.out.print("Enter username : ");
            name = input.next();
            store_name[i] = name;
            System.out.print("Enter password : ");
            password = input.next();
            store_pass[i] = password;
            i++;

            System.out.print("\n");
        }

        public void login() {
            int check = 0;
            System.out.println("Login");
            System.out.println("--------------");
            System.out.print("Enter username : ");
            l_name = input.next();
            System.out.print("Enter password : ");
            l_password = input.next();

            for (int a = 0; a < i; a++) {
                if (store_name[a].equals(l_name) && store_pass[a].equals(l_password)) {
                    check = 1;
                    break;
                } else {
                    check = 0;
                }
            }

            if (check == 1) {
                System.out.println("Login Successful");
            } else
                System.out.println("Login Failure");
                System.out.println("Please register a account first");
                System.out.print("\n");
                register();
        }

        public int order() {
            int x = 0;
            int total = 0;
            int value;
            System.out.print("Hello, " + store_name[z]);
            System.out.print("\n");
            System.out.println("ID  Product                                          Price");
            System.out.println("-----------------------------------------------------------");
            System.out.println("1.  Mechanical keyboard(blue switch)                 RM90");
            System.out.println("2.  Gaming Mouse                                     RM152");
            System.out.println("3.  27 inch 2k Monitor                               RM1300");
            System.out.println("4.  Nvidia GeForce RTX3090                           RM13350");
            System.out.println("5.  Nvidia GeForce RTX3060ti                         RM3700");
            System.out.println("6.  Intel i5-11400                                   RM890 ");
            System.out.println("7.  Total page");
            do {
                System.out.print("Enter product ID: ");
                int order = input.nextInt();

                switch (order) {
                    case 1:
                        System.out.println("Product:Mechanical keyboard(blue switch)   RM90");
                        System.out.print("Enter quantity :");
                        value = input.nextInt();
                        q_1[z] = value;
                        total = total + (90 * value);
                        System.out.println("Total: " + total);
                        break;
                    case 2:
                        System.out.println("Product:Gaming Mouse   RM152");
                        System.out.print("Enter quantity :");
                        value = input.nextInt();
                        q_2[z] = value;
                        total = total + (152 * value);
                        System.out.println("Total: " + total);
                        break;
                    case 3:
                        System.out.println("Product:27 inch 2k Monitor   RM1300");
                        System.out.print("Enter quantity :");
                        value = input.nextInt();
                        q_3[z] = value;
                        total = total + (1300 * value);
                        System.out.println("Total: " + total);
                        break;
                    case 4:
                        System.out.println("Product:Nvidia GeForce RTX3090   RM13350");
                        System.out.print("Enter quantity :");
                        value = input.nextInt();
                        q_4[z] = value;
                        total = total + (13350 * value);
                        System.out.println("Total: " + total);
                        break;
                    case 5:
                        System.out.println("Product:Nvidia GeForce RTX3060ti   RM3700");
                        System.out.print("Enter quantity :");
                        value = input.nextInt();
                        q_5[z] = value;
                        total = total + (3700 * value);
                        System.out.println("Total: " + total);
                        break;
                    case 6:
                        System.out.println("Product:Intel i5-11400   RM890");
                        System.out.print("Enter quantity :");
                        value = input.nextInt();
                        q_6[z] = value;
                        total = total + (890 * value);
                        System.out.println("Total: " + total);
                        break;
                    default:
                        System.out.println("Order successful");
                        return 0;
                }
                Total[z] = total;
            } while (x == 0);
            z++;
            System.out.print("\n");
            return x;
        }

        public void express() {
            System.out.println("Express company");
            System.out.println("----------------");
            System.out.println("1. J&T");
            System.out.println("2. Pos laju");
            System.out.print("\nSelect Express company: ");
            int company = input.nextInt();
            if (company == 1) {
                System.out.println("Your Order ID: " + jt + i);
                store_com[y] = jt + i;
                y++;
            } else if (company == 2) {
                System.out.println("Your Order ID: " + pos_laju + i);
                store_com[y] = pos_laju + i;
                y++;
            }

            System.out.print("\n");
        }

        public void display() {
            int arr = i - 1;
            System.out.print("Your order list");
            System.out.print("\n");
            System.out.println("Name: " + store_name[arr] + "                         Order ID: " + store_com[arr]);
            System.out.println("Product details                                Quantity");
            System.out.println("-----------------------------------------------------------");
            System.out.println("Mechanical keyboard(blue switch)                  " + q_1[arr]);
            System.out.println("Gaming Mouse                                      " + q_2[arr]);
            System.out.println("27 inch 2k monitor                                " + q_3[arr]);
            System.out.println("Nvidia GeForce RTX3090                            " + q_4[arr]);
            System.out.println("Nvidia GeForce RTX3060ti                          " + q_5[arr]);
            System.out.println("Intel i5-11400                                    " + q_6[arr]);
            System.out.println("                                             --------------");
            System.out.println("                                           Total: " + Total[arr]);

            System.out.print("\n");
        }
    }

    class tracking_system extends user {
        int ch, c;

        public void check_ID() {
            System.out.println("Enter Tracking ID: ");
            String id = input.next();
            for (int b = 0; b < i; b++) {
                if (id.equals(store_com[b])) {
                    ch = 1;
                    c = b;
                    break;
                } else
                    ch = 0;
            }

            if (ch == 1) {
                System.out.print("Parcel Information");
                System.out.println("To: " + store_name[c] + "              Order ID: " + store_com[c]);
                System.out.println("----------------------------------------------");
                System.out.println("Parcel has been picked by courier");
                System.out.println("Sender is preparing to ship your parcel");
                System.out.print("\n");
            }
            else {
                System.out.println("Invalid Order ID");
                check_ID();
            }
            System.out.println("1. Get more details of your parcel");
            System.out.println("2. Back to tracking page");
            System.out.println("3. Cancel");
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Details");
                    System.out.println("Buyer Information: " + store_name[c] + "             Order ID: " + store_com[c]);
                    System.out.println("Product details                                Quantity");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Mechanical keyboard(blue switch)                  " + q_1[c]);
                    System.out.println("Gaming Mouse                                      " + q_2[c]);
                    System.out.println("27 inch 2k monitor                                " + q_3[c]);
                    System.out.println("Nvidia GeForce RTX3090                            " + q_4[c]);
                    System.out.println("Nvidia GeForce RTX3060ti                          " + q_5[c]);
                    System.out.println("Intel i5-11400                                    " + q_6[c]);
                    System.out.println("                                             --------------");
                    System.out.println("                                           Total: " + Total[c]);
                    break;
                case 2:
                    check_ID();
                    break;
                default:
                    break;
            }
        }
    }
    class admin extends user{
        public void admin() {
            String admin_ID="AhLim", admin_pass="0000";
            System.out.print("Enter Admin ID: ");
            String ad_ID=input.next();
            System.out.print("Enter Admin password: ");
            String ad_pass=input.next();
            System.out.print("\n");

            if(ad_ID.equals(admin_ID) && ad_pass.equals(admin_pass)){
                System.out.println("Welcome back, " + ad_ID);
                System.out.print("\n");
                System.out.print("Admin: " + ad_ID+ "                      Status: Online");
                System.out.print("\n");
                System.out.println("1. Edit customer name");
                System.out.println("2. Remove customer order");
                System.out.println("3. Exit");
                System.out.print("Enter a number: ");
                int ad=input.nextInt();

                switch (ad){
                    case 1: edit();
                            break;
                    case 2: remove();
                            break;
                    default:System.out.print("Logout Successful");
                            break;
                }
            }
            else
                System.out.println("Invalid");
        }
        public void edit(){
            System.out.println("Edit customer details");
            System.out.println("---------------------");
            System.out.print("Enter customer ID: ");
            String cus_ID=input.next();
            System.out.print("\n");
            for(int a=0;a<i;a++){
                if(cus_ID.equals(store_name[a])){
                    System.out.println("Found");
                    System.out.print("Please enter new customer ID: ");
                    String cus_ID_1=input.next();
                    cus_ID_1=store_name[a];
                    System.out.println("Edit successful");

                }
                else{
                    System.out.println("Invalid customer ID");
                }
            }
        }
        public void remove() {
            int check=0;
            System.out.println("Remove");
            System.out.println("------");
            System.out.println("Enter customer ID:");
            String r_ID = input.next();
            System.out.print("\n");

            for (int a = 0; a < i; a++) {
                if (r_ID.equals(store_name[a])) {
                    /*for(int j=a;j<i-1;j++){
                        store_name[j]=store_name[j+1];
                    }*/
                    check=1;
                    break;
                }
                else
                    check=0;
            }
            if(check==1){
                System.out.println("Found");
                System.out.println("Remove successful");
            }
            else
                System.out.println("Invalid customer ID");
        }
    }
