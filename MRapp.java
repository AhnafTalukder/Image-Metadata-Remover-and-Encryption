// Metadata Remover : MRapp.java
// Main Source File

// Rajin, Ahnaf, Elham

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.util.Scanner;

public class MRapp
{
    public static void main(String[] args) // MAIN FUNCTION
    {
        System.out.println("----- METADATA REMOVER -----");

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the file path: ");
        String filePath = sc.nextLine();

        System.out.print("Please enter where the cleansed image should be saved: ");
        String outputPath = sc.nextLine();

        sc.close(); // Done reading input;

        try {
            //implement our own BufferedImage, ImageIO.read
            BufferedImage image = ImageIO.read(new File(filePath));

            //implement ImageIO write
            ImageIO.write(image, "jpg", new File(outputPath));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    } // End of main


    // ----- HELPER METHODS ----- //
    // To be continued ...


} // End of class
