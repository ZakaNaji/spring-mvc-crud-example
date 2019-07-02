package ma.znaji.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import ma.znaji.model.Employee;

public class EmployeeDAO {
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(Employee employee) {
        String sql = "INSERT INTO emp(name, salary, resume) VALUES ('" + employee.getName() + "', " + employee.getSalary() + ", '" + employee.getResume() + "')";
        System.out.println(sql);
        return jdbcTemplate.update(sql);
    }

    public List<Employee> getListEmp() {
        String sql = "SELECT * FROM emp";
        return jdbcTemplate.query(sql, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt(1));
                employee.setName(resultSet.getString(2));
                employee.setSalary(resultSet.getDouble(3));
                employee.setResume(resultSet.getString(4));
                return employee;
            }
        });
    }

    public Employee getEmployee(long id) {
        String sql = "SELECT * FROM emp WHERE id = " + id;
        System.out.printf(sql);
        return jdbcTemplate.queryForObject(sql, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt(1));
                employee.setName(resultSet.getString(2));
                employee.setSalary(resultSet.getDouble(3));
                employee.setResume(resultSet.getString(4));
                return employee;
            }
        });
    }

    public int updateEmployee(Employee employee) {
        String sqli = "UPDATE emp SET name = '" + employee.getName() + "' ,salary = " + employee.getSalary() + " ,resume = '" + employee.getResume() + "' WHERE id = " + employee.getId();
        System.out.printf(sqli);
        return jdbcTemplate.update(sqli);
    }
}
