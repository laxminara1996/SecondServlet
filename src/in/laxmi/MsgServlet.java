package in.laxmi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/msgServlet")
public class MsgServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		String name = req.getParameter("name");
		PrintWriter pw = res.getWriter();
		pw.append(name+", good evening ..!");
	}

}
