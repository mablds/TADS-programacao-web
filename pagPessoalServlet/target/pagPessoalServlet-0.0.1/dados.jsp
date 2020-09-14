<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="reset.css">
    <link rel="stylesheet" type="text/css" href="dados.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap" rel="stylesheet">
    <title><c:out value="${dados.getNome()}"/></title>
</head>
<body>
    <header>
        <div id="personal-info-wrapper">
            <div id="photo">
                <img src="<c:out value="${dados.getImg()}"/>" alt="foto de perfil do currículo de Marcelo Arthur">
            </div>
            <div class="vertical-wrapper">
                <div id="name">
                    <h1><c:out value="${dados.getNome()}"/></h1>
                </div>
                <div id="career">
                    <h3><c:out value="${dados.getCargo()}"/></h3>
                </div>
                <div id="grid-infos">
                    <img src="img/calendar.svg" alt="calendar icon"/>
                    <p><c:out value="${dados.getDataNascto()}"/></p>
                    <img src="img/mail.svg" alt="mail icon"/>
                    <p><c:out value="${dados.getEmail()}"/></p>
                    <img src="img/tel.svg" alt="telephone icon"/>
                    <p><c:out value="${dados.getTelefone()}"/></p>
                    <a href="<c:out value="${dados.getGithub()}"/>"><img src="img/github.svg" alt="github icon"/></a>
                    <a href="<c:out value="${dados.getGithub()}"/>"><p>Github</p></a>
                    <a href="<c:out value="${dados.getSourcerer()}"/>"><img src="img/website.svg" alt="sourcerer.io icon"/></a>
                    <a href="<c:out value="${dados.getSourcerer()}"/>"><p>Sourcerer</p></a>
                    <a href="<c:out value="${dados.getLinkedin()}"/>"><img src="img/linkedin.svg" alt="linkedin icon" /></a>
                    <a href="<c:out value="${dados.getLinkedin()}"/>"><p>LinkedIn</p></a>
                </div>
            </div>
        </div>
    </header>
    <main>
        <div id="experiences">
            <h2>
                Experiência Profissional
            </h2>
            <div class="job-exp">
                <span>
                    <c:out value="${exp3.getCargo()}"/>
                </span>
                <p class="company">
                    <c:out value="${exp3.getEmpresa()}"/>
                </p>
                <p class="time">
                    <c:out value="${exp3.getPeriodo()}"/>
                </p>
                <p class="job-description">
                    <c:out value="${exp3.getDescricaoTrabalho()}"/>                   
                </p>
            </div>
            <div class="job-exp">
                <span>
                    <c:out value="${exp2.getCargo()}"/>
                </span>
                <p class="company">
                    <c:out value="${exp2.getEmpresa()}"/>
                </p>
                <p class="time">
                    <c:out value="${exp2.getPeriodo()}"/>
                </p>
                <p class="job-description">
                    <c:out value="${exp2.getDescricaoTrabalho()}"/>  
                </p>
            </div>
            <div class="job-exp">
                <span>
                    <c:out value="${exp1.getCargo()}"/>  
                </span>
                <p class="company">
                    <c:out value="${exp1.getEmpresa()}"/>  
                </p>
                <p class="time">
                    <c:out value="${exp1.getPeriodo()}"/>  
                </p>
                <p class="job-description">
                    <c:out value="${exp1.getDescricaoTrabalho()}"/>  
                </p>
            </div>
        </div>
        <div id="main-vertical-wrapper">
            <div id="skills">
                <h2>
                    Skills
                </h2>
                <div class="skill">
                    <span>
                        <c:out value="${skill1.getTitulo()}"/>  
                    </span>
                    <p class="description">
                        <c:out value="${skill1.getSkills()}"/>  
                    </p>
                </div>
                <div class="skill">
                    <span>
                        <c:out value="${skill2.getTitulo()}"/> 
                    </span>
                    <p class="description">
                        <c:out value="${skill2.getSkills()}"/>  
                    </p>
                </div>
                <div class="skill">
                    <span>
                        <c:out value="${skill3.getTitulo()}"/>
                    </span>
                    <p class="description">
                        <c:out value="${skill3.getSkills()}"/>  
                    </p>
                </div>

                <div class="skill">
                    <span>
                        <c:out value="${skill4.getTitulo()}"/>
                    </span>
                    <p class="description">
                        <c:out value="${skill4.getSkills()}"/>  
                    </p>
                </div>
            </div>
            <div id="education">
                <h2>
                    Educação
                </h2>
                <div class="college">
                    <span><c:out value="${edu.getCurso()}"/></span>
                    <p class="description">
                        <c:out value="${edu.getInstituicao()}"/>
                    </p>
                    <p class="time">
                        <c:out value="${edu.getPeriodo()}"/>
                    </p>
                    <p class="description">
                        <c:out value="${edu.getDescricao()}"/>
                    </p>
                </div>
            </div>
                <div id="language"><h2>
                    Idiomas
                </h2>
                <span><c:out value="${idi1.getIdioma()}"/> - <c:out value="${idi1.getNivel()}"/></span>
                <span><c:out value="${idi3.getIdioma()}"/> - <c:out value="${idi3.getNivel()}"/></span>
                <span><c:out value="${idi2.getIdioma()}"/> - <c:out value="${idi2.getNivel()}"/></span>
            </div>
        </div>
    </main>
</body>
</html>