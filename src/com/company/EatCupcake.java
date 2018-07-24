package com.company;

import java.util.Scanner;

public class EatCupcake {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Did anyone see you?");
        String response = in.next();

        if(response.equals("YES")){
            System.out.println("Was it a boss/lover/parent? ");
            response = in.next();
            if(response.equals("NO")){
                System.out.println("EAT IT.");
            }else{
                System.out.println("Was it expensive?");
                response = in.next();
                if(response.equals("YES")){
                    System.out.println("Can you cut off the part that touched the floor?");
                    response = in.next();
                    if(response.equals("YES")){
                        System.out.println("EAT IT.");
                    }else{
                        System.out.println("YOUR CALL");
                    }
                }else{
                    System.out.println("Is it chocolate?");
                    response = in.next();
                    if(response.equals("YES")){
                        System.out.println("EAT IT.");
                    }else{
                        System.out.println("DON'T EAT IT.");
                    }
                }
            }
        }else {
            System.out.println("Was it sticky?");
            response = in.next();
            if(response.equals("YES")){
                System.out.println("Is it a raw steak?");
                response = in.next();
                if(response.equals("YES")){
                    System.out.println("Are you a puma?");
                    response = in.next();
                    if(response.equals("YES")){
                        System.out.println("EAT IT.");
                    }else{
                        System.out.println("DON'T EAT IT.");
                    }
                }else{
                    System.out.println("Did the cat lick it?");
                    response = in.next();
                    if(response.equals("YES")){
                        System.out.println("Is your cat healthy?");
                        response = in.next();
                        if(response.equals("YES")){
                            System.out.println("EAT IT.");
                        }
                        System.out.println("YOUR CALL");

                    }else{
                        System.out.println("EAT IT.");
                    }
                }
            }else{
                System.out.println("Is it an Emausaurus?");
                response = in.next();
                if(response.equals("YES")){
                    System.out.println("Are you a Megalosaurus?");
                    response = in.next();
                    if(response.equals("YES")){
                        System.out.println("EAT IT.");
                    }else{
                        System.out.println("DON'T EAT IT.");
                    }
                }else{

                    System.out.println("Did the cat lick it?");
                    response = in.next();
                    if(response.equals("YES")){
                        System.out.println("Is your cat healthy?");
                        response = in.next();
                        if(response.equals("NO")){
                            System.out.println("YOUR CALL");
                        }else{
                            System.out.println("EAT IT.");
                        }


                    }else{
                        System.out.println("EAT IT.");
                    }
                }
            }
        }

    }
}
