import java.util.Scanner;

public class VaccineAppointment {
    public static void main(String[] args) {
        // Variable declaration
        String vaccineNb, location, timeSlot, shotNb;
        Scanner keyboard = new Scanner(System.in);

        // This loop allows the user to return to the original choice of vaccine brand
        // when the user chooses to exit an inner-loop
        // It also allows the program to check for the validity of the user's input by
        // bringing him back to the begining if he doesn't
        // enter an appropriate/allowed input.
        while (true) {
            // ------------------------------------------------------------
            // WELCOME BANNER SECTION
            // This section displays the welcome message of the program
            // ------------------------------------------------------------
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("  Welcome to Covid19 Vaccine Appointment Program!");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Here is the Covid-19 vaccine menu:");
            System.out.println("	1. Pfizer");
            System.out.println("	2. Moderna");
            System.out.println("	3. AstraZeneca");
            System.out.println("	4. Johnson&Johnson");
            System.out.println("	5. Sinovac");
            System.out.println("	6. Gamaleya");
            System.out.println("	7. Exit");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            // Input of user's choice
            System.out.println("Please enter your choice (1-7): ");
            vaccineNb = keyboard.next();

            // This switch case statement switches to different instructions based on the
            // user's choice of vaccine
            switch (vaccineNb) {

                // Set of instructions if user chooses first vaccine
                case "1":

                    // Declaration of choice
                    System.out.println("Your choice is: Pfizer");
                    System.out.println("");

                    // Loop for location of vaccination (which allows input validation)
                    while (true) {

                        // Asks for User Input
                        System.out.println("Please choose the location of vaccine Pfizer:");
                        System.out.println("	1 - Pharmaprix");
                        System.out.println("	2 - Jean Coutu");
                        System.out.println("Please enter your choice (1-5): ");
                        location = keyboard.next();

                        // If statement in order to determine which inputs are available (1-2 is
                        // allowed, else isn't)
                        if (location.equals("1") || location.equals("2")) {

                            // Loop for available time slots for vaccination appointment
                            while (true) {

                                // Asks for user input
                                System.out.println("Please choose the time slots :");
                                System.out.println("	1 - 2:00 - 2:15");
                                System.out.println("	2 - 2:20 - 2:35");
                                System.out.println("	3 - 2:40 - 2:55");
                                System.out.println("	4 - 3:00 - 3:15");
                                System.out.println("	5 - Quit");
                                System.out.println("Please enter your choice (1-5): ");
                                timeSlot = keyboard.next();

                                // If statement in order to determine which inputs are available (1 to 5 is
                                // allowed, else isn't)
                                // This specific if statement states the following instructions after user
                                // chooses options 1 to 4
                                if (timeSlot.equals("1") || timeSlot.equals("2") || timeSlot.equals("3")
                                        || timeSlot.equals("4")) {

                                    // Loop for dose choice
                                    while (true) {

                                        // Asks for user input
                                        System.out.println("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
                                        shotNb = keyboard.next();

                                        // If statement in order to determine which inputs are available (1 and 2 is
                                        // allowed, else isn't)
                                        // This specific if statement states the following instructions after user
                                        // chooses option 1 (shots)
                                        if (shotNb.equals("1")) {

                                            // ------------------------------------------------
                                            // Report Generation Section
                                            // This is where the final message is displayed
                                            // ------------------------------------------------
                                            System.out.println(
                                                    "Your booked appointment is: Pfizer, " + shotNb + "st dose.");
                                            System.out.print("Your schedule is: ");

                                            // Switch Case which determines which time slot to display in final message
                                            // depending on previous
                                            // user input.
                                            switch (timeSlot) {
                                                case "1":
                                                    System.out.print("2:00 - 2:15 @ ");
                                                    break;
                                                case "2":
                                                    System.out.print("2:20 - 2:35 @ ");
                                                    break;
                                                case "3":
                                                    System.out.print("2:40 - 2:55 @ ");
                                                    break;
                                                case "4":
                                                    System.out.print("3:00 - 3:15 @ ");
                                                    break;
                                            }

                                            // If statement which determines which location to display in final message
                                            // depending
                                            // on previous user input.
                                            if (location.equals("1")) {
                                                System.out.print("Pharmaprix");
                                            } else if (location.equals("2")) {
                                                System.out.println("Jean Coutu");
                                            }
                                            System.out.println("");

                                            // Closing Message
                                            System.out.println(
                                                    "Thank you for using Covid19 Vaccine Appointment Program!");
                                            keyboard.close();
                                            System.exit(0);

                                            // This specific if statement states the following instructions after user
                                            // chooses option 2 (shots)
                                        } else if (shotNb.equals("2")) {

                                            // ------------------------------------------------
                                            // Report Generation Section
                                            // This is where the final message is displayed
                                            // ------------------------------------------------
                                            System.out.println(
                                                    "Your booked appointment is: Pfizer, " + shotNb + "nd dose.");
                                            System.out.print("Your schedule is: ");

                                            // Switch Case which determines which time slot to display in final message
                                            // depending on previous
                                            // user input.
                                            switch (timeSlot) {
                                                case "1":
                                                    System.out.print("2:00 - 2:15 @ ");
                                                    break;
                                                case "2":
                                                    System.out.print("2:20 - 2:35 @ ");
                                                    break;
                                                case "3":
                                                    System.out.print("2:40 - 2:55 @ ");
                                                    break;
                                                case "4":
                                                    System.out.print("3:00 - 3:15 @ ");
                                                    break;
                                            }

                                            // If statement which determines which location to display in final message
                                            // depending
                                            // on previous user input.
                                            if (location.equals("1")) {
                                                System.out.print("Pharmaprix");
                                            } else if (location.equals("2")) {
                                                System.out.println("Jean Coutu");
                                            }
                                            System.out.println("");

                                            // Closing Message
                                            System.out.println(
                                                    "Thank you for using Covid19 Vaccine Appointment Program!");
                                            keyboard.close();
                                            System.exit(0);
                                        } else
                                            System.out.println("That is a wrong input. Please try again!");
                                    }

                                    // This specific if statement states the following instructions after user
                                    // chooses option 5
                                } else if (timeSlot.equals("5")) {

                                    // While loop in order to ask if user wants to exit program or try again (also
                                    // allows input validation)
                                    while (true) {

                                        // Asks for user input
                                        System.out.println(
                                                "Your appointment is not booked successfully! Would you like to try again? (yes or no)");
                                        String tryAgain = keyboard.next();

                                        // Breaks loop if user enters yes in order for user to go back to initial choice
                                        // of vaccine brands
                                        if (tryAgain.equals("yes")) {
                                            break;

                                            // Ends program if user decides not to try again
                                        } else if (tryAgain.equals("no")) {

                                            // Closing message and program termination
                                            System.out.println(
                                                    "Thank you for using Covid19 Vaccine Appointment Program!");
                                            keyboard.close();
                                            System.exit(0);

                                            // Input validation message when user enters input other than "yes" or "no"
                                        } else {
                                            System.out.println("That is a wrong input. Please try again!");
                                        }
                                    }
                                    break;

                                    // Input validation message when user enters input other than 1 to 5 (time
                                    // slots)
                                } else
                                    System.out.println("That is a wrong input. Please try again!");
                            }
                            break;

                            // Input validation message when user enters input other than allowed locations
                        } else
                            System.out.println("That is a wrong input. Please try again!");
                    }
                    break;

                // Set of instructions if user chooses second vaccine
                case "2":

                    // Declaration of choice
                    System.out.println("Your choice is: Moderna");
                    System.out.println("");

                    // Loop for location of vaccination (which allows input validation)
                    while (true) {

                        // Asks for user input
                        System.out.println("Please choose the location of vaccine Pfizer:");
                        System.out.println("	1 - Pharmaprix");
                        System.out.println("	3 - Uniprix Clinique");
                        System.out.println("	4 - Health Center");
                        System.out.println("Please enter your choice (1-5): ");
                        location = keyboard.next();

                        // If statement in order to determine which inputs are available (1-3-4 is
                        // allowed, else isn't)
                        if (location.equals("1") || location.equals("3") || location.equals("4")) {

                            // Loop for available time slots for vaccination appointment
                            while (true) {

                                // Asks for user input
                                System.out.println("Please choose the time slots :");
                                System.out.println("	1 - 2:00 - 2:15");
                                System.out.println("	2 - 2:20 - 2:35");
                                System.out.println("	3 - 2:40 - 2:55");
                                System.out.println("	4 - 3:00 - 3:15");
                                System.out.println("	5 - Quit");
                                System.out.println("Please enter your choice (1-5): ");
                                timeSlot = keyboard.next();

                                // If statement in order to determine which inputs are available (1 to 5 is
                                // allowed, else isn't)
                                // This specific if statement states the following instructions after chooses
                                // options 1 to 4
                                if (timeSlot.equals("1") || timeSlot.equals("2") || timeSlot.equals("3")
                                        || timeSlot.equals("4")) {

                                    // Loop for dose choice
                                    while (true) {

                                        // Asks for user input
                                        System.out.println("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
                                        shotNb = keyboard.next();

                                        // if statement in order to determine which inputs are available (1 and 2 is
                                        // allowed, else isn't)
                                        // This specific if statement states the following instructions after user
                                        // chooses option 1 (shots)
                                        if (shotNb.equals("1")) {

                                            // -------------------------------------------------
                                            // Report Generation Section
                                            // This is where the final message is displayed
                                            // -------------------------------------------------
                                            System.out.println(
                                                    "Your booked appointment is: Moderna, " + shotNb + "st dose.");
                                            System.out.print("Your schedule is: ");

                                            // Switch Case which determines which time slot to display in final message
                                            // depending on previous
                                            // user input
                                            switch (timeSlot) {
                                                case "1":
                                                    System.out.print("2:00 - 2:15 @ ");
                                                    break;
                                                case "2":
                                                    System.out.print("2:20 - 2:35 @ ");
                                                    break;
                                                case "3":
                                                    System.out.print("2:40 - 2:55 @ ");
                                                    break;
                                                case "4":
                                                    System.out.print("3:00 - 3:15 @ ");
                                                    break;
                                            }

                                            // If statement which determines which location to display in final message
                                            // depending
                                            // on previous user input.
                                            if (location.equals("1")) {
                                                System.out.print("Pharmaprix");
                                            } else if (location.equals("3")) {
                                                System.out.print("Uniprix Clinique");
                                            } else if (location.equals("4")) {
                                                System.out.println("Health Center");
                                            }
                                            System.out.println("");

                                            // Closing Message
                                            System.out.println(
                                                    "Thank you for using Covid19 Vaccine Appointment Program!");
                                            keyboard.close();
                                            System.exit(0);

                                            // This specific if statement states the following instructions after user
                                            // chooses option 2 (shots)
                                        } else if (shotNb.equals("2")) {

                                            // -------------------------------------------------
                                            // Report Generation Section
                                            // This is where the final message is displayed
                                            // -------------------------------------------------
                                            System.out.println(
                                                    "Your booked appointment is: Moderna, " + shotNb + "nd dose.");
                                            System.out.print("Your schedule is: ");

                                            // Switch case which determines which time slot to display in final message
                                            // depending on previous
                                            // user input.
                                            switch (timeSlot) {
                                                case "1":
                                                    System.out.print("2:00 - 2:15 @ ");
                                                    break;
                                                case "2":
                                                    System.out.print("2:20 - 2:35 @ ");
                                                    break;
                                                case "3":
                                                    System.out.print("2:40 - 2:55 @ ");
                                                    break;
                                                case "4":
                                                    System.out.print("3:00 - 3:15 @ ");
                                                    break;
                                            }

                                            // If statement which determines which location to display in final message
                                            // depending
                                            // on previous user input.
                                            if (location.equals("1")) {
                                                System.out.print("Pharmaprix");
                                            } else if (location.equals("3")) {
                                                System.out.print("Uniprix Clinique");
                                            } else if (location.equals("4")) {
                                                System.out.println("Health Center");
                                            }
                                            System.out.println("");

                                            // Closing Message
                                            System.out.println(
                                                    "Thank you for using Covid19 Vaccine Appointment Program!");
                                            keyboard.close();
                                            System.exit(0);
                                        } else
                                            System.out.println("That is a wrong input. Please try again!");
                                    }

                                    // This specific if statement states the following instructions after user
                                    // chooses option 5
                                } else if (timeSlot.equals("5")) {

                                    // While loop in order to ask if user wants to exit the program or try again
                                    // (also allows input validation)
                                    while (true) {

                                        // Asks for user input
                                        System.out.println(
                                                "Your appointment is not booked successfully! Would you like to try again? (yes or no)");
                                        String tryAgain = keyboard.next();

                                        // Breaks loop if user enters yes in order for user to go back to initial choice
                                        // of vaccine brands
                                        if (tryAgain.equals("yes")) {
                                            break;

                                            // Ends program if user decides not to try again
                                        } else if (tryAgain.equals("no")) {

                                            // Closing message and program termination
                                            System.out.println(
                                                    "Thank you for using Covid19 Vaccine Appointment Program!");
                                            keyboard.close();
                                            System.exit(0);

                                            // Input validation message when user enters input other than "yes" or "no"
                                        } else {
                                            System.out.println("That is a wrong input. Please try again!");
                                        }
                                    }
                                    break;

                                    // Input validation message when user enters input other than 1 to 5 (time
                                    // slots)
                                } else
                                    System.out.println("That is a wrong input. Please try again!");
                            }
                            break;

                            // Input validation message when user enters input other than allowed locations
                        } else
                            System.out.println("That is a wrong input. Please try again!");
                    }
                    break;

                // Set of instructions if user chooses third vaccine
                case "3":

                    // Declaration of choice
                    System.out.println("Your choice is: AstraZeneca");
                    System.out.println("");

                    // Loop for location of vaccination (which allows input validation)
                    while (true) {

                        // Asks for user input
                        System.out.println("Please choose the location of vaccine Pfizer:");
                        System.out.println("	2 - Jean Coutu");
                        System.out.println("	3 - Uniprix Clinique");
                        System.out.println("Please enter your choice (1-5): ");
                        location = keyboard.next();

                        // If statement in order to determine which inputs are available (2-3 is
                        // allowed, else isn't)
                        if (location.equals("2") || location.equals("3")) {

                            // Loop for available time slots for vaccination appointment
                            while (true) {

                                // Asks for user input
                                System.out.println("Please choose the time slots :");
                                System.out.println("	1 - 2:00 - 2:15");
                                System.out.println("	2 - 2:20 - 2:35");
                                System.out.println("	3 - 2:40 - 2:55");
                                System.out.println("	4 - 3:00 - 3:15");
                                System.out.println("	5 - Quit");
                                System.out.println("Please enter your choice (1-5): ");
                                timeSlot = keyboard.next();

                                // If statement in order to determine which inputs are available (1 to 5
                                // allowed, else isn't)
                                // This specific if statement states the following instructions after user
                                // chooses options 1 to 4)
                                if (timeSlot.equals("1") || timeSlot.equals("2") || timeSlot.equals("3")
                                        || timeSlot.equals("4")) {

                                    // Loop for dose choice
                                    while (true) {

                                        // Asks for user input
                                        System.out.println("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
                                        shotNb = keyboard.next();

                                        // If statement in order to determine which inputs are available (1 and 2 is
                                        // allowed, else isn't)
                                        // This specific if statement states the following instructions after user
                                        // chooses option 1 (shots)
                                        if (shotNb.equals("1")) {

                                            // ----------------------------------------------
                                            // Report Generation Section
                                            // This is where the final message is displayed
                                            // ----------------------------------------------
                                            System.out.println(
                                                    "Your booked appointment is: AstraZeneca, " + shotNb + "st dose.");
                                            System.out.print("Your schedule is: ");

                                            // Switch case which determines which time slot to display in final message
                                            // depending on previous
                                            // user input.
                                            switch (timeSlot) {
                                                case "1":
                                                    System.out.print("2:00 - 2:15 @ ");
                                                    break;
                                                case "2":
                                                    System.out.print("2:20 - 2:35 @ ");
                                                    break;
                                                case "3":
                                                    System.out.print("2:40 - 2:55 @ ");
                                                    break;
                                                case "4":
                                                    System.out.print("3:00 - 3:15 @ ");
                                                    break;
                                            }

                                            // If statement which determines which location to display in final message
                                            // depending
                                            // on previous user input.
                                            if (location.equals("2")) {
                                                System.out.print("Jean Coutu");
                                            } else if (location.equals("3")) {
                                                System.out.println("Uniprix Clinique");
                                            }

                                            // Closing Message
                                            System.out.println("");
                                            System.out.println(
                                                    "Thank you for using Covid19 Vaccine Appointment Program!");
                                            keyboard.close();
                                            System.exit(0);

                                            // This specific if statement states the following instructions after user
                                            // chooses option 2 (shots)
                                        } else if (shotNb.equals("2")) {

                                            // ----------------------------------------------
                                            // Report Generation Section
                                            // This is where the final message is displayed
                                            // ----------------------------------------------
                                            System.out.println(
                                                    "Your booked appointment is: Pfizer, " + shotNb + "nd dose.");
                                            System.out.print("Your schedule is: ");

                                            // Switch case which determines which time slot to display in final message
                                            // depending on
                                            // previous user input
                                            switch (timeSlot) {
                                                case "1":
                                                    System.out.print("2:00 - 2:15 @ ");
                                                    break;
                                                case "2":
                                                    System.out.print("2:20 - 2:35 @ ");
                                                    break;
                                                case "3":
                                                    System.out.print("2:40 - 2:55 @ ");
                                                    break;
                                                case "4":
                                                    System.out.print("3:00 - 3:15 @ ");
                                                    break;
                                            }

                                            // If statement which determines which location to display in final message
                                            // depending on
                                            // previous user input.
                                            if (location.equals("2")) {
                                                System.out.print("Jean Coutu");
                                            } else if (location.equals("3")) {
                                                System.out.println("Uniprix Clinique");
                                            }
                                            System.out.println("");

                                            // Closing Message
                                            System.out.println(
                                                    "Thank you for using Covid19 Vaccine Appointment Program!");
                                            keyboard.close();
                                            System.exit(0);
                                        } else
                                            System.out.println("That is a wrong input. Please try again!");
                                    }

                                    // This specific if statement states the following instructions after user
                                    // chooses option 5
                                } else if (timeSlot.equals("5")) {

                                    // While loop in order to ask if user wants to exit the program or try again
                                    // (also allows input validation)
                                    while (true) {

                                        // Asks for user input
                                        System.out.println(
                                                "Your appointment is not booked successfully! Would you like to try again? (yes or no)");
                                        String tryAgain = keyboard.next();

                                        // Breaks loop if user enters yes in order for user to go back to initial choice
                                        // of vaccine brands
                                        if (tryAgain.equals("yes")) {
                                            break;

                                            // Ends program if user decides not to try again
                                        } else if (tryAgain.equals("no")) {

                                            // Closing message and program termination
                                            System.out.println(
                                                    "Thank you for using Covid19 Vaccine Appointment Program!");
                                            keyboard.close();
                                            System.exit(0);

                                            // Input validation message when user enters input other than "yes" or "no"
                                        } else {
                                            System.out.println("That is a wrong input. Please try again!");
                                        }
                                    }
                                    break;

                                    // Input validation when user enters input other than 1 to 5 (time slots)
                                } else
                                    System.out.println("That is a wrong input. Please try again!");
                            }
                            break;

                            // Input validation message when user enters input other than allowed locations
                        } else
                            System.out.println("That is a wrong input. Please try again!");
                    }
                    break;

                // Set of instructions if user chooses fourth vaccine
                case "4":

                    // Declaration of choice
                    System.out.println("Your choice is: Johnson & Johnson");
                    System.out.println("");

                    // Loop for location of vaccination (which allows input validation)
                    while (true) {

                        // Asks for user input
                        System.out.println("Please choose the location of vaccine Pfizer:");
                        System.out.println("	4 - Health Center");
                        System.out.println("Please enter your choice (1-5): ");
                        location = keyboard.next();

                        // If statement in order to determine which inputs are available (4 is allowed,
                        // else isn't)
                        if (location.equals("4")) {

                            // Loop for available time slots for vaccination appointment
                            while (true) {

                                // Asks for user input
                                System.out.println("Please choose the time slots :");
                                System.out.println("	1 - 2:00 - 2:15");
                                System.out.println("	2 - 2:20 - 2:35");
                                System.out.println("	3 - 2:40 - 2:55");
                                System.out.println("	4 - 3:00 - 3:15");
                                System.out.println("	5 - Quit");
                                System.out.println("Please enter your choice (1-5): ");
                                timeSlot = keyboard.next();

                                // If statement in order to determine which inputs are available (1 to 5
                                // allowed, else isn't)
                                // This specific if statement states the following instructions after user
                                // chooses options 1 to 4)
                                if (timeSlot.equals("1") || timeSlot.equals("2") || timeSlot.equals("3")
                                        || timeSlot.equals("4")) {

                                    // Loop for dose choice
                                    while (true) {

                                        // Asks for user input
                                        System.out.println("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
                                        shotNb = keyboard.next();

                                        // If statement in order to determine which inputs are available (1 and 2 is
                                        // allowed, else isn't)
                                        // This specific if statement states the following instructions after user
                                        // chooses option 1 (shots)
                                        if (shotNb.equals("1")) {

                                            // ----------------------------------------------
                                            // Report Generation Section
                                            // This is where the final message is displayed
                                            // ----------------------------------------------
                                            System.out.println("Your booked appointment is: Johnson & Johnson, "
                                                    + shotNb + "st dose.");
                                            System.out.print("Your schedule is: ");

                                            // Switch case which determines which time slot to display in final message
                                            // depending on previous
                                            // user input.
                                            switch (timeSlot) {
                                                case "1":
                                                    System.out.print("2:00 - 2:15 @ ");
                                                    break;
                                                case "2":
                                                    System.out.print("2:20 - 2:35 @ ");
                                                    break;
                                                case "3":
                                                    System.out.print("2:40 - 2:55 @ ");
                                                    break;
                                                case "4":
                                                    System.out.print("3:00 - 3:15 @ ");
                                                    break;
                                            }

                                            // If statement which determines which location to display in final message
                                            // depending
                                            // on previous user input.
                                            if (location.equals("4")) {
                                                System.out.println("Health Center");
                                            }
                                            System.out.println("");

                                            // Closing message
                                            System.out.println(
                                                    "Thank you for using Covid19 Vaccine Appointment Program!");
                                            keyboard.close();
                                            System.exit(0);

                                            // This specific if statement states the following instructions after user
                                            // chooses option 2 (shots)
                                        } else if (shotNb.equals("2")) {

                                            // ----------------------------------------------
                                            // Report Generation Section
                                            // This is where the final message is displayed
                                            // ----------------------------------------------
                                            System.out.println("Your booked appointment is: Johnson & Johnson, "
                                                    + shotNb + "nd dose.");
                                            System.out.print("Your schedule is: ");

                                            // Switch case which determines which time slot to display in final message
                                            // depending on
                                            // previous user input
                                            switch (timeSlot) {
                                                case "1":
                                                    System.out.print("2:00 - 2:15 @ ");
                                                    break;
                                                case "2":
                                                    System.out.print("2:20 - 2:35 @ ");
                                                    break;
                                                case "3":
                                                    System.out.print("2:40 - 2:55 @ ");
                                                    break;
                                                case "4":
                                                    System.out.print("3:00 - 3:15 @ ");
                                                    break;
                                            }

                                            // If statement which determines which location to display in final message
                                            // depending on
                                            // previous user input.
                                            if (location.equals("4")) {
                                                System.out.println("Health Center");
                                            }
                                            System.out.println("");

                                            // Closing message
                                            System.out.println(
                                                    "Thank you for using Covid19 Vaccine Appointment Program!");
                                            keyboard.close();
                                            System.exit(0);
                                        } else
                                            System.out.println("That is a wrong input. Please try again!");
                                    }

                                    // This specific if statement states the following instructions after user
                                    // chooses option 5
                                } else if (timeSlot.equals("5")) {

                                    // While loop in order to ask if user wants to exit the program or try again
                                    // (also allows input validation)
                                    while (true) {

                                        // asks for user input
                                        System.out.println(
                                                "Your appointment is not booked successfully! Would you like to try again? (yes or no)");
                                        String tryAgain = keyboard.next();

                                        // Breaks loop if user enters yes in order for user to go back to initial choice
                                        // of vaccine brands
                                        if (tryAgain.equals("yes")) {
                                            break;

                                            // Ends program if user decides not to try again
                                        } else if (tryAgain.equals("no")) {

                                            // Closing message and program termination
                                            System.out.println(
                                                    "Thank you for using Covid19 Vaccine Appointment Program!");
                                            keyboard.close();
                                            System.exit(0);

                                            // Input validation message when user enters input other than "yes" or "no"
                                        } else {
                                            System.out.println("That is a wrong input. Please try again!");
                                        }
                                    }
                                    break;

                                    // Input validation when user enters input other than 1 to 5 (time slots)
                                } else
                                    System.out.println("That is a wrong input. Please try again!");
                            }
                            break;

                            // Input validation message when user enters input other than allowed locations
                        } else
                            System.out.println("That is a wrong input. Please try again!");
                    }
                    break;

                // Set of instructions if user chooses fifth vaccine
                case "5":
                    System.out.println("Sorry, the vaccine is currently not available now!");

                    // While loop in order to ask if user wants to exit the program or try again
                    // (also allows input validation)
                    while (true) {

                        // Asks for user input
                        System.out.println(
                                "Your appointment is not booked successfully! Would you like to try again? (yes or no)");
                        String tryAgain = keyboard.next();

                        // Breaks loop if user enters yes in order for user to go back to initial choice
                        // of vaccine brands
                        if (tryAgain.equals("yes")) {
                            break;

                            // Ends program if user decides not to try again
                        } else if (tryAgain.equals("no")) {

                            // Closing message and program termination
                            System.out.println("Thank you for using Covid19 Vaccine Appointment Program!");
                            keyboard.close();
                            System.exit(0);

                            // Input validation message when user enters input other than "yes" or "no"
                        } else {
                            System.out.println("That is a wrong input. Please try again!");
                        }
                    }
                    break;

                // Set of instructions if user chooses sixth vaccine
                case "6":
                    System.out.println("Sorry, the vaccine is currently not available now!");

                    // While loop in order to ask if user wants to exit the program or try again
                    // (also allows input validation)
                    while (true) {

                        // Asks for user input
                        System.out.println(
                                "Your appointment is not booked successfully! Would you like to try again? (yes or no)");
                        String tryAgain = keyboard.next();

                        // Breaks loop if user enters yes in order for user to go back to initial choice
                        // of vaccine brands
                        if (tryAgain.equals("yes")) {
                            break;

                            // Ends program if user decides not to try again
                        } else if (tryAgain.equals("no")) {

                            // Closing message and program termination
                            System.out.println("Thank you for using Covid19 Vaccine Appointment Program!");
                            keyboard.close();
                            System.exit(0);

                            // Input validation message when user enters input other than "yes" or "no"
                        } else {
                            System.out.println("That is a wrong input. Please try again!");
                        }
                    }
                    break;

                // Set of instructions if user chooses seventh vaccine
                case "7":

                    // While loop in order to ask if user wants to exit the program or try again
                    // (also allows input validation)
                    while (true) {

                        // Asks for user input
                        System.out.println(
                                "Your appointment is not booked successfully! Would you like to try again? (yes or no)");
                        String tryAgain = keyboard.next();

                        // Breaks loop if user enters yes in order for user to go back to initial choice
                        // of vaccine brands
                        if (tryAgain.equals("yes")) {
                            break;

                            // Ends program if user decides not to try again
                        } else if (tryAgain.equals("no")) {

                            // Closing message and program termination
                            System.out.println("Thank you for using Covid19 Vaccine Appointment Program!");
                            keyboard.close();
                            System.exit(0);

                            // Input validation message when user enters input other than "yes" or "no"
                        } else {
                            System.out.println("That is a wrong input. Please try again!");
                        }
                    }

                    // Set of instructions if user enters input other than given options (input
                    // validation)
                default:
                    System.out.println("That is a wrong input. Please try again!");

                    break;
            }
        }
    }
}