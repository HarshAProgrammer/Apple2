package com.android.apple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    List<ProductData> myProductList;
    ProductData mProductData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        myProductList = new ArrayList<>();
        mProductData = new ProductData("iPhone","•\tDisplay\t\t3.50-inch (320x480)\n" +
                "•\tProcessor\t412 MHz one-core\n" +
                "•\tFront Camera\tNo\n" +
                "•\tRear Camera\t2MP\n" +
                "•\tRAM\t\t128MB\n" +
                "•\tStorage\t4GB\n" +
                "•\tOS\t\tiOS 3\n","",R.drawable.iphone);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone 3G","•\tProcessor\t412 MHz one-core\n" +
                "•\tRear Camera\t2MP\n" +
                "•\tRAM\t\t128MB\n" +
                "•\tStorage\t8GB\n" +
                "•\tOS\t\tiOS\n","",R.drawable.iphone3g);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone 3GS","•\tProcessor \t600 MHz one-core\n" +
                "•\tFront Camera\tNo\n" +
                "•\tRear Camera\t3.15MP\n" +
                "•\tRAM\t\t256MB\n" +
                "•\tStorage\t8GB\n" +
                "•\tOS\t\tiOS 6.1.3\n","",R.drawable.iphone3gs);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone4","•\tDisplay\t\t\t3.50-inch (640x960)\n" +
                "•\tProcessor\t\tone-core\n" +
                "•\tFront Camera\t\t0.3MP\n" +
                "•\tRear Camera\t\t5MP\n" +
                "•\tRAM\t\t\t512MB\n" +
                "•\tStorage\t\t8GB\n" +
                "•\tBattery Capacity\t1420mAh\n" +
                "•\tOS\t\t\tiOS 6.1.3\n","",R.drawable.iphone4);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone 4S","•\tDisplay\t\t\t3.50-inch (640x960)\n" +
                "•\tProcessor\t\t800 MHz dual-core\n" +
                "•\tFront Camera\t\t0.3MP\n" +
                "•\tRear Camera\t\t8MP\n" +
                "•\tRAM\t\t\t512MB\n" +
                "•\tStorage\t\t8GB\n" +
                "•\tBattery Capacity\t1430mAh\n" +
                "•\tOS\t\t\tiOS 6.1.3\n","",R.drawable.iphone4s);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone 5","•\tDisplay\t\t\t4.00-inch (640x1136)\n" +
                "•\tProcessor\t\tApple A6\n" +
                "•\tFront Camera\t\t1.2MP\n" +
                "•\tRear Camera\t\t8MP\n" +
                "•\tRAM\t\t\t1GB\n" +
                "•\tStorage\t\t16GB\n" +
                "•\tBattery Capacity\t1440mAh\n" +
                "•\tOS\t\t\tiOS 6.1.4\n","",R.drawable.iphone5);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone 5c","•\tDisplay\t\t\t4.00-inch (640x1136)\n" +
                "•\tProcessor\t\tApple A6\n" +
                "•\tFront Camera\t\t1.2MP\n" +
                "•\tRear Camera\t\t8MP\n" +
                "•\tRAM\t\t\t1GB\n" +
                "•\tStorage\t\t8GB\n" +
                "•\tBattery Capacity\t1507mAh\n" +
                "•\tOS\t\t\tiOS 7\n","",R.drawable.iphone5c);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone 5s","•\tDisplay\t\t\t4.00-inch (640x1136)\n" +
                "•\tProcessor\t\tApple A7\n" +
                "•\tFront Camera\t\t1.2MP\n" +
                "•\tRear Camera\t\t8MP\n" +
                "•\tRAM\t\t\t1GB\n" +
                "•\tStorage\t\t16GB\n" +
                "•\tBattery Capacity\t1570mAh\n" +
                "•\tOS\t\t\tiOS 7\n","",R.drawable.iphone5s);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone 6","•\tDisplay\t\t\t4.70-inch (750x1334)\n" +
                "•\tProcessor\t\tApple A8\n" +
                "•\tFront Camera\t\t1.2MP\n" +
                "•\tRear Camera\t\t8MP\n" +
                "•\tRAM\t\t\t1GB\n" +
                "•\tStorage\t\t16GB\n" +
                "•\tBattery Capacity\t1810mAh\n" +
                "•\tOS\t\t\tiOS 8.0\n","",R.drawable.iphone6);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone 6 Plus","•\tDisplay\t\t\t5.50-inch (1080x1920)\n" +
                "•\tProcessor\t\tApple A8\n" +
                "•\tFront Camera\t\t1.2MP\n" +
                "•\tRear Camera\t\t8MP\n" +
                "•\tRAM\t\t\t1GB\n" +
                "•\tStorage\t\t16GB\n" +
                "•\tBattery Capacity\t2915mAh\n" +
                "•\tOS\t\t\tiOS 8.0\n","",R.drawable.iphone6plus);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone 6s","•\tDisplay\t\t\t4.70-inch (750x1334)\n" +
                "•\tProcessor\t\tApple A9\n" +
                "•\tFront Camera\t\t5MP\n" +
                "•\tRear Camera\t\t12MP\n" +
                "•\tRAM\t\t\t2GB\n" +
                "•\tStorage\t\t16GB\n" +
                "•\tBattery Capacity\t1715mAh\n" +
                "•\tOS\t\t\tiOS 9\n","",R.drawable.iphone6s);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone 6s Plus","•\tDisplay\t\t\t5.50-inch (1080x1920)\n" +
                "•\tProcessor\t\tApple A9\n" +
                "•\tFront Camera\t\t5MP\n" +
                "•\tRear Camera\t\t12MP\n" +
                "•\tRAM\t\t\t2GB\n" +
                "•\tStorage\t\t16GB\n" +
                "•\tBattery Capacity\t2750mAh\n" +
                "•\tOS\t\t\tiOS 9\n","",R.drawable.iphone6splus);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone SE","•\tDisplay\t\t\t4.00-inch (640x1136)\n" +
                "•\tProcessor\t\tApple A9\n" +
                "•\tFront Camera\t\t1.2MP\n" +
                "•\tRear Camera\t\t12MP\n" +
                "•\tRAM\t\t\t2GB\n" +
                "•\tStorage\t\t16GB\n" +
                "•\tOS\t\t\tiOS 9.3\n","",R.drawable.iphonese);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone 7","•\tDisplay\t\t\t4.70-inch (750x1334)\n" +
                "•\tProcessor\t\tApple A10 Fusion\n" +
                "•\tFront Camera\t\t7MP\n" +
                "•\tRear Camera\t\t12MP\n" +
                "•\tRAM\t\t\t2GB\n" +
                "•\tStorage\t\t32GB\n" +
                "•\tBattery Capacity\t1960mAh\n" +
                "•\tOS\t\t\tiOS 10\n","",R.drawable.iphone7);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone 7 Plus","•\tDisplay\t\t\t5.50-inch (1080x1920)\n" +
                "•\tProcessor\t\tApple A10 Fusion\n" +
                "•\tFront Camera\t\t7MP\n" +
                "•\tRear Camera\t\t12MP\n" +
                "•\tRAM\t\t\t3GB\n" +
                "•\tStorage\t\t32GB\n" +
                "•\tBattery Capacity\t2900mAh\n" +
                "•\tOS\t\t\tiOS 10\n","",R.drawable.iphone7plus);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone X","•\tDisplay\t\t\t5.80-inch (1125x2436)\n" +
                "•\tProcessor\t\tApple A11 Bionic\n" +
                "•\tFront Camera\t\t7MP\n" +
                "•\tRear Camera\t\t12MP + 12MP\n" +
                "•\tRAM\t\t\t3GB\n" +
                "•\tStorage\t\t64GB\n" +
                "•\tBattery Capacity\t2716mAh\n" +
                "•\tOS\t\t\tiOS 11\n","",R.drawable.iphonex);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone 8 Plus","•\tDisplay\t\t\t5.50-inch (1080x1920)\n" +
                "•\tProcessor\t\tApple A11 Bionic\n" +
                "•\tFront Camera\t\t7MP\n" +
                "•\tRear Camera\t\t12MP\n" +
                "•\tRAM\t\t\t3GB\n" +
                "•\tStorage\t\t64GB\n" +
                "•\tBattery Capacity\t2691mAh\n" +
                "•\tOS\t\t\tiOS 11\n","",R.drawable.iphone8plus);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone 8","•\tDisplay\t\t\t4.70-inch (750x1334)\n" +
                "•\tProcessor\t\tApple A11 Bionic\n" +
                "•\tFront Camera\t\t7MP\n" +
                "•\tRear Camera\t\t12MP\n" +
                "•\tRAM\t\t\t2GB\n" +
                "•\tStorage\t\t64GB\n" +
                "•\tBattery Capacity\t1821mAh\n" +
                "•\tOS\t\t\tiOS 11\n","",R.drawable.iphone8);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone XS","•\tDisplay\t\t\t5.80-inch (1125x2436)\n" +
                "•\tProcessor\t\tApple A12 Bionic\n" +
                "•\tFront Camera\t\t7MP\n" +
                "•\tRear Camera\t\t12MP + 12MP\n" +
                "•\tStorage\t\t64GB\n" +
                "•\tOS\t\t\tiOS 12\n","",R.drawable.iphonexs);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone XS Max","•\tDisplay\t\t\t6.50-inch (1242x2688)\n" +
                "•\tProcessor\t\tApple A12 Bionic\n" +
                "•\tFront Camera\t\t7MP\n" +
                "•\tRear Camera\t\t12MP + 12MP\n" +
                "•\tStorage\t\t64GB\n" +
                "•\tOS\t\t\tiOS 12\n","",R.drawable.iphonexsmax);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone XR","•\tDisplay\t\t\t6.10-inch (828x1792)\n" +
                "•\tProcessor\t\tApple A12 Bionic\n" +
                "•\tFront Camera\t\t7MP\n" +
                "•\tRear Camera\t\t12MP\n" +
                "•\tRAM\t\t\t3GB\n" +
                "•\tStorage\t\t64GB\n" +
                "•\tBattery Capacity\t2942mAh\n" +
                "•\tOS\t\t\tiOS 12\n","",R.drawable.iphonexr);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone 11","•\tDisplay\t\t\t6.10-inch (828x1792)\n" +
                "•\tProcessor\t\tApple A13 Bionic\n" +
                "•\tFront Camera\t\t12MP\n" +
                "•\tRear Camera\t\t12MP + 12MP\n" +
                "•\tRAM\t\t\t4GB\n" +
                "•\tStorage\t\t64GB\n" +
                "•\tBattery Capacity\t3110mAh\n" +
                "•\tOS\t\t\tiOS 13\n" +
                "\n","",R.drawable.iphone11);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone 11 Pro Max","•\tDisplay\t\t\t6.50-inch (1242x2688)\n" +
                "•\tProcessor\t\tApple A13 Bionic\n" +
                "•\tFront Camera\t\t12MP\n" +
                "•\tRear Camera\t\t12MP + 12MP + 12MP\n" +
                "•\tRAM\t\t\t4GB\n" +
                "•\tStorage\t\t64GB\n" +
                "•\tBattery Capacity\t3969mAh\n" +
                "•\tOS\t\t\tiOS 13\n" +
                "\n","",R.drawable.iphone11promax);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone 11 Pro","•\tDisplay\t\t\t5.80-inch (1125x2436)\n" +
                "•\tProcessor\t\tApple A13 Bionic\n" +
                "•\tFront Camera\t\t12MP\n" +
                "•\tRear Camera\t\t12MP + 12MP + 12MP\n" +
                "•\tRAM\t\t\t4GB\n" +
                "•\tStorage\t\t64GB\n" +
                "•\tBattery Capacity\t3046mAh\n" +
                "•\tOS\t\t\tiOS 13\n" +
                "\n","",R.drawable.iphone11pro);
        myProductList.add(mProductData);
        mProductData = new ProductData("iPhone SE(2020)","•\tDisplay\t\t\t4.70-inch (750x1334)\n" +
                "•\tFront Camera\t\t7MP\n" +
                "•\tRear Camera\t\t12MP\n" +
                "•\tStorage\t\t64GB\n" +
                "•\tOS\t\t\tiOS 13\n","",R.drawable.iphonese2);
        myProductList.add(mProductData);


        MyAdapter myAdapter = new MyAdapter(MainActivity.this,myProductList);
        mRecyclerView.setAdapter(myAdapter);

    }
}
