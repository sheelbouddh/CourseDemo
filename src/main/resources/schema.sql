CREATE TABLE course (
    course_id INT AUTO_INCREMENT NOT NULL,
    title varchar(80) NOT NULL,         -- Course Title
    description varchar(500) NOT NULL,  -- Course Description
    link varchar(255) NOT NULL,         -- Course landing page link
    PRIMARY KEY (course_id)
);