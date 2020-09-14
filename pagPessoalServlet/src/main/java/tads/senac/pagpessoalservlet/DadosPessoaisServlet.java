package tads.senac.pagpessoalservlet;

import tads.senac.models.Skills;
import tads.senac.models.Idioma;
import tads.senac.models.ExperienciaTrabalho;
import tads.senac.models.Educacao;
import tads.senac.models.DadosPessoais;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "DadosPessoaisServlet", urlPatterns = {"/dados-pessoais"})
public class DadosPessoaisServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {      
        DadosPessoais dados = new DadosPessoais();
        dados.setNome("Marcelo Braga");
        dados.setImg("img/profile.jpg");
        dados.setEmail("marcelobragalemos@gmail.com");
        dados.setCargo("Desenvolvedor Fullstack");
        dados.setTelefone("(11) 96854-5506");
        dados.setDataNascto(LocalDate.of(1996, 6, 13));
        dados.setGithub("http://github.com/mablds");
        dados.setSourcerer("https://sourcerer.io/mablds");
        dados.setLinkedin("https://www.linkedin.com/in/marcelo-arthur/");
        
        Educacao edu = new Educacao();
        edu.setInstituicao("SENAC");
        edu.setPeriodo("01/2019 - 07/2021");
        edu.setCurso("Análise e Desenvolvimento de Sistemas");
        edu.setDescricao("Tecnólogo voltado a desenvolvimento de softwares utilizando Java, Kotlin e Javascript buscando abordar as melhores práticas atuais do mercado.");
   
        ExperienciaTrabalho exp1 = new ExperienciaTrabalho();
        exp1.setCargo("Estagiario Desenvolvedor");
        exp1.setEmpresa("Moka Mind - LCS Link");
        exp1.setPeriodo("02/2019 - 09/2019");
        exp1.setDescricaoTrabalho("Desenvolver novas integrações para o Backend com funcionalidades do Office 365 configuração, manutenção e desenvolvimento de soluções para os produtos IoT da empresa.");
        
        ExperienciaTrabalho exp2 = new ExperienciaTrabalho();
        exp2.setCargo("Desenvolvedor Fullstack");
        exp2.setEmpresa("Altran");
        exp2.setPeriodo("10/2019 - 03/2020");
        exp2.setDescricaoTrabalho("Criação de um portal interno de controle de ponto, gestão de banco de horas, centralizador de documentos. Experiência como QA, automatizando testes unitários, de integração e E2E para um projeto da Embraer.");
        
        ExperienciaTrabalho exp3 = new ExperienciaTrabalho();
        exp3.setCargo("Desenvolvedor Fullstack");
        exp3.setEmpresa("TIVIT");
        exp3.setPeriodo("03/2020 - Atual");
        exp3.setDescricaoTrabalho("Responsável pela melhoria de qualidade de um sistema criado sem controle de versionamento, documentação, code-review, logs ou testes. Automação dos serviços internos da área de governança.");
        
        Idioma idi1 = new Idioma();
        idi1.setIdioma("Inglês");
        idi1.setNivel("Avançado");
        
        Idioma idi2 = new Idioma();
        idi2.setIdioma("Português");
        idi2.setNivel("Nativo");
        
        Idioma idi3 = new Idioma();
        idi3.setIdioma("Espanhol");
        idi3.setNivel("Básico");
        
        Skills skill1 = new Skills();
        skill1.setTitulo("Node.js");
        skill1.setSkills("REST APIs, Async JS, ES6+, Child Processes, Express, Nest.js, Jest");
        
        Skills skill2 = new Skills();
        skill2.setTitulo("React.js");
        skill2.setSkills("Hooks, Router");
        
        Skills skill3 = new Skills();
        skill3.setTitulo("Go");
        skill3.setSkills("REST APIs, Hugo, CLI apps");
        
        Skills skill4 = new Skills();
        skill4.setTitulo("Java");
        skill4.setSkills("Spring Framework, POO");
     
        request.setAttribute("dados", dados);
        request.setAttribute("edu", edu);
        
        request.setAttribute("exp1", exp1);
        request.setAttribute("exp2", exp2);
        request.setAttribute("exp3", exp3);
        
        request.setAttribute("idi1", idi1);
        request.setAttribute("idi2", idi2);
        request.setAttribute("idi3", idi3);
        
        request.setAttribute("skill1", skill1);
        request.setAttribute("skill2", skill2);
        request.setAttribute("skill3", skill3);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("dados.jsp");
        dispatcher.forward(request, response);
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
