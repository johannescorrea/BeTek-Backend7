DROP TABLE IF EXISTS Estudiante;
CREATE TABLE Estudiante (
                            IDEstudiante INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                            Nombre VARCHAR(100) NOT NULL,
                            Apellido VARCHAR(100) NOT NULL,
                            FechaNacimiento DATE DEFAULT NULL,
                            Direccion VARCHAR(200) DEFAULT NULL
);

-- Table structure for table profesores
DROP TABLE IF EXISTS profesores;
CREATE TABLE profesores (
                            IDProfesor INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                            NombreProfesor VARCHAR(50) DEFAULT NULL,
                            ApellidoProfesor VARCHAR(50) DEFAULT NULL,
                            Especialidad VARCHAR(50) DEFAULT NULL
);

DROP TABLE IF EXISTS cursos;
CREATE TABLE cursos (
                        IDCursos INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                        NombreCurso VARCHAR(50) DEFAULT NULL,
                        DuracionCurso INT DEFAULT NULL,
                        IDProfesor INT DEFAULT NULL,
                        FOREIGN KEY (IDProfesor) REFERENCES profesores(IDProfesor)
);

DROP TABLE IF EXISTS matricula;
CREATE TABLE matricula (
                           IDMatricula INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                           IDEstudiante INT DEFAULT NULL,
                           IDCurso INT DEFAULT NULL,
                           FOREIGN KEY (IDEstudiante) REFERENCES Estudiante(IDEstudiante),
                           FOREIGN KEY (IDCurso) REFERENCES cursos(IDCursos)
);

-- Table structure for table calificacion
DROP TABLE IF EXISTS calificacion;
CREATE TABLE calificacion (
                              IDCalificacion INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                              IDEstudiante INT DEFAULT NULL,
                              IDCurso INT DEFAULT NULL,
                              Calificacion DOUBLE DEFAULT NULL,
                              FOREIGN KEY (IDEstudiante) REFERENCES Estudiante(IDEstudiante),
                              FOREIGN KEY (IDCurso) REFERENCES cursos(IDCursos)
);