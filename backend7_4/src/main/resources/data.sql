-- Insert data into Estudiante
INSERT INTO Estudiante (IDEstudiante, Nombre, Apellido, FechaNacimiento, Direccion)
VALUES
    (1, 'Carlos', 'Gómez', '2000-01-01', 'Calle 123, Ciudad A'),
    (2, 'Ana', 'Pérez', '1999-02-15', 'Avenida 456, Ciudad B'),
    (3, 'Luis', 'Martínez', '1998-03-10', 'Calle 789, Ciudad C'),
    (4, 'Laura', 'Sánchez', '2001-04-22', 'Avenida 101, Ciudad D'),
    (5, 'Javier', 'Rodríguez', '1997-05-30', 'Calle 202, Ciudad E'),
    (6, 'María', 'García', '1998-09-25', 'Avenida 303, Ciudad F'),
    (7, 'Pedro', 'Rodríguez', '2001-12-10', 'Calle 404, Ciudad G'),
    (8, 'Isabel', 'Morales', '2000-06-08', 'Avenida 505, Ciudad H'),
    (9, 'Fernando', 'Díaz', '1999-08-16', 'Calle 606, Ciudad I'),
    (10, 'Valeria', 'López', '2002-02-21', 'Avenida 707, Ciudad J'),
    (11, 'Carlos', 'Zapata', '2002-02-21', 'Avenida 707, Ciudad J');

-- Insert data into profesores
INSERT INTO profesores (IDProfesor, NombreProfesor, ApellidoProfesor, Especialidad)
VALUES
    (1, 'Carlos', 'Gómez', 'Desarrollo Web Frontend'),
    (2, 'Ana', 'Pérez', 'Programación en Java'),
    (3, 'Luis', 'Martínez', 'Bases de Datos'),
    (4, 'Laura', 'Sánchez', 'Desarrollo de Aplicaciones Móviles'),
    (5, 'Javier', 'Rodríguez', 'Diseño de Interfaces de Usuario'),
    (6, 'María', 'García', 'Programación en Python'),
    (7, 'Pedro', 'Fernández', 'Algoritmos y Estructuras de Datos'),
    (8, 'Isabel', 'Morales', 'Desarrollo en JavaScript'),
    (9, 'Fernando', 'Torres', 'Seguridad Informática'),
    (10, 'Valeria', 'López', 'Metodologías Ágiles para el Desarrollo de Software');

-- Insert data into cursos
INSERT INTO cursos (IDCursos, NombreCurso, DuracionCurso, IDProfesor)
VALUES
    (1, 'Desarrollo Web Frontend', 8, 1),
    (2, 'Introducción a la Programación en Java', 12, 2),
    (3, 'Fundamentos de Bases de Datos', 10, 3),
    (4, 'Desarrollo de Aplicaciones Móviles', 14, 4),
    (5, 'Diseño de Interfaces de Usuario', 6, 5),
    (6, 'Programación en Python', 12, 6),
    (7, 'Algoritmos y Estructuras de Datos', 10, 7),
    (8, 'Desarrollo de Aplicaciones en JavaScript', 8, 8),
    (9, 'Seguridad Informática', 10, 9),
    (10, 'Metodologías Ágiles para el Desarrollo de Software', 8, 10);



-- Insert data into matricula
INSERT INTO matricula (IDMatricula, IDEstudiante, IDCurso)
VALUES
    (1, 1, 1),
    (2, 1, 2),
    (3, 1, 3),
    (4, 1, 4),
    (5, 1, 5),
    (6, 2, 1),
    (7, 2, 2),
    (8, 2, 3),
    (9, 2, 4),
    (10, 2, 5),
    (11, 3, 1),
    (12, 3, 2),
    (13, 3, 3),
    (14, 3, 4),
    (15, 3, 5),
    (16, 4, 1),
    (17, 4, 2),
    (18, 4, 3),
    (19, 4, 4),
    (20, 4, 5),
    (21, 5, 1),
    (22, 5, 2),
    (23, 5, 3),
    (24, 5, 4),
    (25, 5, 5);

-- Insert data into calificacion
INSERT INTO calificacion (IDCalificacion, IDEstudiante, IDCurso, Calificacion)
VALUES
    (1, 1, 1, 0.05),
    (2, 1, 2, 1.59),
    (3, 1, 3, 7.77),
    (4, 1, 4, 4.12),
    (5, 1, 5, 7.26),
    (6, 2, 1, 3.95),
    (7, 2, 2, 7.98),
    (8, 2, 3, 8.03),
    (9, 2, 4, 6.21),
    (10, 2, 5, 6.95),
    (11, 3, 1, 6.14),
    (12, 3, 2, 9.85),
    (13, 3, 3, 0.81),
    (14, 3, 4, 4.5),
    (15, 3, 5, 0.08),
    (16, 4, 1, 6.88),
    (17, 4, 2, 4.18),
    (18, 4, 3, 0.25),
    (19, 4, 4, 8.69),
    (20, 4, 5, 2.73),
    (21, 5, 1, 7.58),
    (22, 5, 2, 9.7),
    (23, 5, 3, 5.78),
    (24, 5, 4, 9.79),
    (25, 5, 5, 1.62);



