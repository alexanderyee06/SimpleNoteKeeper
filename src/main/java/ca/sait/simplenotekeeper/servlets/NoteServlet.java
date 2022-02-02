/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.simplenotekeeper.servlets;

import ca.sait.simplenotekeeper.javabeans.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alexander Yee
 */
public class NoteServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            
            String query = request.getQueryString();
            // to read files
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));

            String title = br.readLine();
            String contents = br.readLine();
            //Create a new note
            Note note = new Note(title, contents);  
            request.setAttribute("note", note);

            if (query != null && query.contains("edit")){
                getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            }
            else {
                getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            String path = getServletContext().getRealPath("/WEB-INF/note.txt");

            // to write to a file
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
    }

}
