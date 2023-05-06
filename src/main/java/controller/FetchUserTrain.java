package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import dao.TrainDao;
import dto.Train;

@WebServlet("/usertraininfo")
public class FetchUserTrain extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		TrainDao dao=new TrainDao();
		List<Train>list=dao.fetchAll();
		
		if(list.isEmpty()){
			res.getWriter().print("<h1 style='color:red'>No Railway information");
			req.getRequestDispatcher("UserHome.html").include(req, res);
		}else{
			req.setAttribute("list", list);
			req.getRequestDispatcher("UserFetchRailway.jsp").include(req, res);

		}
	

	}
}
