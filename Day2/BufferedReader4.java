package BufferReaderAndWriter.BufferedReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// Taking user input using BufferedReader
public class BufferedReader4 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        System.out.println();
        System.out.print("Enter name: ");
        String name = br.readLine(); // the br.readLine() always reads the input as strings and returns it.
        // Scanner
        System.out.println("Hello " + name);
    }
}

/*
Actually getting inputs from user in this way is popular and this approach was mostly used in the competative coding platforms like:
        Codeforces
        LeetCode (large inputs)
        HackerRank

How it actually works?
    System.in (byte stream)
            ↓
    InputStreamReader (byte → char conversion)
            ↓
    BufferedReader (fast reading)
This combo converts raw input → readable text → efficiently

Faster than Scanner
    BufferedReader:
        Just reads raw text
        Minimal processing → fast
    Scanner:
        Parses input (int, double, etc.)
        Uses regex internally → slow

Used in Competitive Programming
    In platforms like:
        Codeforces
        LeetCode (large inputs)
        HackerRank
    Input size is huge (10⁵+ lines)
        Scanner → may cause TLE (Time Limit Exceeded)
        BufferedReader → safe and fast
*/