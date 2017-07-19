package com.clouway.input_output;

import java.util.List;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class DirBrowserApp {

    public static void main(String[] args) {

        DirectoryBrowser browser = new DirectoryBrowser();
        List<PathInfoHolder> files = browser.listContent(".");
        System.out.println("Path contents: \n");
        for (PathInfoHolder each : files) {
            System.out.println(each);
        }

    }

}