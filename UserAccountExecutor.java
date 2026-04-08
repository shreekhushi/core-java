class UserAccountExecutor{

    public static void main(String[] u){

        String i1[] = {"Shopping", "Gaming"};
        String i2[] = {"Reading"};
        String i3[] = {"Music", "Movies"};
        String i4[] = {"Coding"};
        String i5[] = {"Travel", "Photography"};
        String i6[] = {"Fitness"};
        String i7[] = {"Cooking", "Blogging"};
        String i8[] = {"Sports"};

        WebSite website = new WebSite();

        UserAccount u1 = new UserAccount();
        u1.userId = 1;
        u1.userName = "Rahul";
        u1.email = "rahul@gmail.com";
        u1.password = "rahul123";
        u1.accountType = "Free";
        u1.interests = i1;
        boolean added = website.createAccount(u1);
        System.out.println(added);

        UserAccount u2 = new UserAccount();
        u2.userId = 2;
        u2.userName = "Priya";
        u2.email = "priya@gmail.com";
        u2.password = "priya123";
        u2.accountType = "Premium";
        u2.interests = i2;
        added = website.createAccount(u2);
        System.out.println(added);

        UserAccount u3 = new UserAccount();
        u3.userId = 3;
        u3.userName = "Amit";
        u3.email = "amit@gmail.com";
        u3.password = "amit123";
        u3.accountType = "Free";
        u3.interests = i3;
        added = website.createAccount(u3);
        System.out.println(added);

        UserAccount u4 = new UserAccount();
        u4.userId = 4;
        u4.userName = "Sneha";
        u4.email = "sneha@gmail.com";
        u4.password = "sneha123";
        u4.accountType = "Premium";
        u4.interests = i4;
        added = website.createAccount(u4);
        System.out.println(added);

        UserAccount u5 = new UserAccount();
        u5.userId = 5;
        u5.userName = "Kiran";
        u5.email = "kiran@gmail.com";
        u5.password = "kiran123";
        u5.accountType = "Free";
        u5.interests = i5;
        added = website.createAccount(u5);
        System.out.println(added);

        UserAccount u6 = new UserAccount();
        u6.userId = 6;
        u6.userName = "Anjali";
        u6.email = "anjali@gmail.com";
        u6.password = "anjali123";
        u6.accountType = "Premium";
        u6.interests = i6;
        added = website.createAccount(u6);
        System.out.println(added);

        UserAccount u7 = new UserAccount();
        u7.userId = 7;
        u7.userName = "Ramesh";
        u7.email = "ramesh@gmail.com";
        u7.password = "ramesh123";
        u7.accountType = "Free";
        u7.interests = i7;
        added = website.createAccount(u7);
        System.out.println(added);

        UserAccount u8 = new UserAccount();
        u8.userId = 8;
        u8.userName = "Pooja";
        u8.email = "pooja@gmail.com";
        u8.password = "pooja123";
        u8.accountType = "Premium";
        u8.interests = i8;
        added = website.createAccount(u8);
        System.out.println(added);

        website.getAccounts();
    }
}