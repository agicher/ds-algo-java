package com.github.andavid.ds.algorithm.stringmatch;

import org.junit.Test;

public class BruteForceTest {

  @Test
  public void testBruteForce() {
    BruteForce bf = new BruteForce();
    System.out.println(bf.find("abcdef", "def"));
    System.out.println(bf.find("aaaaab", "ab"));
    System.out.println(bf.find("aaaaaa", "ab"));
  }
}
