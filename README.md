# NamedQueryExample
Example of the use of @NamedQuery

<p>In this example, a database ("example_mysql") is created based on Msql</p>

<p>The fundamental classes are</p>

<ul>
<li>Student</li>
<li>StudentInterface</li>
<li>DataLoader</li>
<li>StudentController</li>
</ul>

<p>The Student class is in charge of representing the model</p>
<p>The StudentInterface is in charge of create the JPA repository</p>
<p>The DataLoader class is in charge of populating the BD</p>
<p>TheStudentController class is in charge of bring the rest endpoints</p>

<p>Three named queries are defined in the model class</p>

<ul>
<li>@NamedQuery(name = "Student.findByEmailAddress", query = "select u from Student u where u.email = :email")</li>
<li>@NamedQuery(name = "Student.findByName", query = "select u from Student u where u.name = :name")</li>
<li>@NamedQuery(name = "Student.findAll", query = "SELECT u FROM Student u")</li>
</ul>

<p>These named query are used in the controller class (StudentController)</p>
<img src="controller.png"/>
