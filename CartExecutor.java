class CartExecutor{

    public static void main(String[] args) {

        Cart c1 = new Cart();
        c1.cartId = 1;
        c1.userName = "Rahul";
        c1.totalItems = 2;
        c1.cartTotal = 1500;
        c1.paymentMethod = "UPI";

        Order o1 = new Order();
        o1.orderId = 101;
        o1.productName = "Shoes";
        o1.quantity = 1;
        o1.totalPrice = 1500;
        o1.orderStatus = "Placed";

        c1.order = o1;
        c1.getCartDetails();


        Cart c2 = new Cart();
        c2.cartId = 2;
        c2.userName = "Sneha";
        c2.totalItems = 3;
        c2.cartTotal = 2500;
        c2.paymentMethod = "Card";

        Order o2 = new Order();
        o2.orderId = 102;
        o2.productName = "Dress";
        o2.quantity = 2;
        o2.totalPrice = 2500;
        o2.orderStatus = "Shipped";

        c2.order = o2;
        c2.getCartDetails();


        Cart c3 = new Cart();
        c3.cartId = 3;
        c3.userName = "Arjun";
        c3.totalItems = 1;
        c3.cartTotal = 800;
        c3.paymentMethod = "Cash";

        Order o3 = new Order();
        o3.orderId = 103;
        o3.productName = "Headphones";
        o3.quantity = 1;
        o3.totalPrice = 800;
        o3.orderStatus = "Delivered";

        c3.order = o3;
        c3.getCartDetails();


        Cart c4 = new Cart();
        c4.cartId = 4;
        c4.userName = "Priya";
        c4.totalItems = 4;
        c4.cartTotal = 3200;
        c4.paymentMethod = "UPI";

        Order o4 = new Order();
        o4.orderId = 104;
        o4.productName = "Makeup Kit";
        o4.quantity = 2;
        o4.totalPrice = 3200;
        o4.orderStatus = "Placed";

        c4.order = o4;
        c4.getCartDetails();


        Cart c5 = new Cart();
        c5.cartId = 5;
        c5.userName = "Kiran";
        c5.totalItems = 2;
        c5.cartTotal = 1200;
        c5.paymentMethod = "Card";

        Order o5 = new Order();
        o5.orderId = 105;
        o5.productName = "Watch";
        o5.quantity = 1;
        o5.totalPrice = 1200;
        o5.orderStatus = "Delivered";

        c5.order = o5;
        c5.getCartDetails();


        Cart c6 = new Cart();
        c6.cartId = 6;
        c6.userName = "Meena";
        c6.totalItems = 3;
        c6.cartTotal = 2100;
        c6.paymentMethod = "UPI";

        Order o6 = new Order();
        o6.orderId = 106;
        o6.productName = "Handbag";
        o6.quantity = 1;
        o6.totalPrice = 2100;
        o6.orderStatus = "Shipped";

        c6.order = o6;
        c6.getCartDetails();


        Cart c7 = new Cart();
        c7.cartId = 7;
        c7.userName = "Ramesh";
        c7.totalItems = 5;
        c7.cartTotal = 5000;
        c7.paymentMethod = "Card";

        Order o7 = new Order();
        o7.orderId = 107;
        o7.productName = "Mobile";
        o7.quantity = 1;
        o7.totalPrice = 5000;
        o7.orderStatus = "Delivered";

        c7.order = o7;
        c7.getCartDetails();


        Cart c8 = new Cart();
        c8.cartId = 8;
        c8.userName = "Divya";
        c8.totalItems = 2;
        c8.cartTotal = 1800;
        c8.paymentMethod = "UPI";

        Order o8 = new Order();
        o8.orderId = 108;
        o8.productName = "Books";
        o8.quantity = 3;
        o8.totalPrice = 1800;
        o8.orderStatus = "Placed";

        c8.order = o8;
        c8.getCartDetails();


        Cart c9 = new Cart();
        c9.cartId = 9;
        c9.userName = "Anjali";
        c9.totalItems = 1;
        c9.cartTotal = 600;
        c9.paymentMethod = "Cash";

        Order o9 = new Order();
        o9.orderId = 109;
        o9.productName = "T-shirt";
        o9.quantity = 2;
        o9.totalPrice = 600;
        o9.orderStatus = "Delivered";

        c9.order = o9;
        c9.getCartDetails();


        Cart c10 = new Cart();
        c10.cartId = 10;
        c10.userName = "Deepak";
        c10.totalItems = 3;
        c10.cartTotal = 2700;
        c10.paymentMethod = "Card";

        Order o10 = new Order();
        o10.orderId = 110;
        o10.productName = "Laptop Bag";
        o10.quantity = 1;
        o10.totalPrice = 2700;
        o10.orderStatus = "Shipped";

        c10.order = o10;
        c10.getCartDetails();


        Cart c11 = new Cart();
        c11.cartId = 11;
        c11.userName = "Vikram";
        c11.totalItems = 2;
        c11.cartTotal = 1400;
        c11.paymentMethod = "UPI";

        Order o11 = new Order();
        o11.orderId = 111;
        o11.productName = "Sunglasses";
        o11.quantity = 1;
        o11.totalPrice = 1400;
        o11.orderStatus = "Placed";

        c11.order = o11;
        c11.getCartDetails();


        Cart c12 = new Cart();
        c12.cartId = 12;
        c12.userName = "Pooja";
        c12.totalItems = 4;
        c12.cartTotal = 3600;
        c12.paymentMethod = "Card";

        Order o12 = new Order();
        o12.orderId = 112;
        o12.productName = "Shoes";
        o12.quantity = 2;
        o12.totalPrice = 3600;
        o12.orderStatus = "Delivered";

        c12.order = o12;
        c12.getCartDetails();


        Cart c13 = new Cart();
        c13.cartId = 13;
        c13.userName = "Manoj";
        c13.totalItems = 1;
        c13.cartTotal = 900;
        c13.paymentMethod = "Cash";

        Order o13 = new Order();
        o13.orderId = 113;
        o13.productName = "Bluetooth Speaker";
        o13.quantity = 1;
        o13.totalPrice = 900;
        o13.orderStatus = "Shipped";

        c13.order = o13;
        c13.getCartDetails();


        Cart c14 = new Cart();
        c14.cartId = 14;
        c14.userName = "Kavya";
        c14.totalItems = 3;
        c14.cartTotal = 2100;
        c14.paymentMethod = "UPI";

        Order o14 = new Order();
        o14.orderId = 114;
        o14.productName = "Kurti";
        o14.quantity = 3;
        o14.totalPrice = 2100;
        o14.orderStatus = "Placed";

        c14.order = o14;
        c14.getCartDetails();


        Cart c15 = new Cart();
        c15.cartId = 15;
        c15.userName = "Nithin";
        c15.totalItems = 2;
        c15.cartTotal = 1600;
        c15.paymentMethod = "Card";

        Order o15 = new Order();
        o15.orderId = 115;
        o15.productName = "Jeans";
        o15.quantity = 2;
        o15.totalPrice = 1600;
        o15.orderStatus = "Delivered";

        c15.order = o15;
        c15.getCartDetails();


        Cart c16 = new Cart();
        c16.cartId = 16;
        c16.userName = "Divakar";
        c16.totalItems = 5;
        c16.cartTotal = 5000;
        c16.paymentMethod = "UPI";

        Order o16 = new Order();
        o16.orderId = 116;
        o16.productName = "Tablet";
        o16.quantity = 1;
        o16.totalPrice = 5000;
        o16.orderStatus = "Shipped";

        c16.order = o16;
        c16.getCartDetails();


        Cart c17 = new Cart();
        c17.cartId = 17;
        c17.userName = "Rohit";
        c17.totalItems = 2;
        c17.cartTotal = 1300;
        c17.paymentMethod = "Cash";

        Order o17 = new Order();
        o17.orderId = 117;
        o17.productName = "Shoes";
        o17.quantity = 1;
        o17.totalPrice = 1300;
        o17.orderStatus = "Placed";

        c17.order = o17;
        c17.getCartDetails();


        Cart c18 = new Cart();
        c18.cartId = 18;
        c18.userName = "Sunita";
        c18.totalItems = 3;
        c18.cartTotal = 2400;
        c18.paymentMethod = "Card";

        Order o18 = new Order();
        o18.orderId = 118;
        o18.productName = "Saree";
        o18.quantity = 1;
        o18.totalPrice = 2400;
        o18.orderStatus = "Delivered";

        c18.order = o18;
        c18.getCartDetails();


        Cart c19 = new Cart();
        c19.cartId = 19;
        c19.userName = "Amit";
        c19.totalItems = 1;
        c19.cartTotal = 700;
        c19.paymentMethod = "UPI";

        Order o19 = new Order();
        o19.orderId = 119;
        o19.productName = "Wallet";
        o19.quantity = 1;
        o19.totalPrice = 700;
        o19.orderStatus = "Shipped";

        c19.order = o19;
        c19.getCartDetails();


        Cart c20 = new Cart();
        c20.cartId = 20;
        c20.userName = "Neha";
        c20.totalItems = 2;
        c20.cartTotal = 1800;
        c20.paymentMethod = "Card";

        Order o20 = new Order();
        o20.orderId = 120;
        o20.productName = "Heels";
        o20.quantity = 1;
        o20.totalPrice = 1800;
        o20.orderStatus = "Placed";

        c20.order = o20;
        c20.getCartDetails();
    }
}