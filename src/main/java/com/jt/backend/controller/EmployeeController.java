package com.jt.backend.controller;

import com.jt.backend.dto.EmployeeRequestDTO;
import com.jt.backend.dto.EmployeeResponseDTO;
import com.jt.backend.mapper.EmployeeMapper;
import com.jt.backend.model.Employee;
import com.jt.backend.service.IEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
* Author @Suprava Parida
* Created on 11th March 2024
* */

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final IEmployeeService employeeService;

    /*
    *@Auhtor Suprava Parida
    * Date 11th March
    * @Param Empolyee
    * This method is used to save employee details
    * */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeResponseDTO createEmp(@RequestBody EmployeeRequestDTO employeeRequestDTO){
        var employee = EmployeeMapper.modelMapper(employeeRequestDTO);
        var result = employeeService.createEmployee(employee);
        return EmployeeMapper.dtoMapper(result);
    }

    /*
     * This method is used to get ALL Employee List
     */
    @GetMapping("/getEmployees")
    public List<EmployeeResponseDTO> getEmployees(){
        var result = employeeService.getEmployees();
        return result.stream().map(EmployeeMapper::dtoMapper).toList();
    }

    /*
     *Param empFirstName,empLastName
     *This method is used to get Unquie Employee Details search by empFirstName and empLastName
     */
    @GetMapping("/getDistinctEmployee/{empFirstName}/{empLastName}")
    public EmployeeResponseDTO getDistinctEmployee(@PathVariable String empFirstName,@PathVariable String empLastName){
        var result = employeeService.getDistinctByEmpFirstNameAndEmpLastName(empFirstName,empLastName);
        return EmployeeMapper.dtoMapper(result);
    }

    /*
     *Param empFirstName,empLastName
     *This method is used to get Employee Details search by empFirstName and empLastName
     */
    @GetMapping("/getEmployeeByName/{empFirstName}/{empLastName}")
    public EmployeeResponseDTO getEmployeeByName(@PathVariable String empFirstName,@PathVariable String empLastName){
        var result = employeeService.getByEmpFirstNameAndEmpLastName(empFirstName,empLastName);
        return EmployeeMapper.dtoMapper(result);
    }

    /*
     *Param empFirstName,empLastName
     *This method is used to get Employee Details search by empFirstName or empLastName
     */
    @GetMapping("/getEmpByLastOrFirstName/{empFirstName}/{empLastName}")
    public List<EmployeeResponseDTO> getEmpByLastOrFirstName(@PathVariable String empFirstName,@PathVariable String empLastName){
        var result = employeeService.getByEmpFirstNameOrEmpLastName(empFirstName,empLastName);
        //return EmployeeMapper.dtoMapper(result);
        return result.stream().map(EmployeeMapper::dtoMapper).toList();
    }

    /*
     *Param empFirstName,empLastName
     *This method is used to get List of Employees Details search by empFirstName(findByFirstname)
     */
    @GetMapping("/getEmpByFirstName/{empFirstName}")
    public List<EmployeeResponseDTO> getEmpByFirstName(@PathVariable String empFirstName){
        var result = employeeService.getByEmpFirstName(empFirstName);
        //return EmployeeMapper.dtoMapper(result);
        return result.stream().map(EmployeeMapper::dtoMapper).toList();
    }

    /*
     *Param empFirstName
     *This method is used to get List of Employees Details search by empFirstName(findByFirstnameIs)
     */
    @GetMapping("/getEmpByFirstNameIs/{empFirstName}")
    public List<EmployeeResponseDTO> getEmpByFirstNameIs(@PathVariable String empFirstName){
        var result = employeeService.getByEmpFirstNameIs(empFirstName);
        //return EmployeeMapper.dtoMapper(result);
        return result.stream().map(EmployeeMapper::dtoMapper).toList();
    }

    /*
     *Param empFirstName
     *This method is used to get List of Employees Details search by empFirstName(findByFirstnameEquals)
     */
    @GetMapping("/getEmpByFirstNameEquals/{empFirstName}")
    public List<EmployeeResponseDTO> getEmpByFirstNameEquals(@PathVariable String empFirstName){
        var result = employeeService.getByEmpFirstNameEquals(empFirstName);
        //return EmployeeMapper.dtoMapper(result);
        return result.stream().map(EmployeeMapper::dtoMapper).toList();
    }


    /*
     *Param empAge
     *This method is used to get List of Employees Those age are less than given age
     */
    @GetMapping("/getEmpByEmpAge/lessThan/{empAge}")
    public List<EmployeeResponseDTO> getEmpByEmpAgeLessThan(@PathVariable String empAge){
        var result = employeeService.getByEmpAgeLessThan(empAge);
        //return EmployeeMapper.dtoMapper(result);
        return result.stream().map(EmployeeMapper::dtoMapper).toList();
    }

    /*
     *Param empAge
     *This method is used to get List of Employees Those age are less than equal given age
     */
    @GetMapping("/getEmpByEmpAge/lessThanEqual/{empAge}")
    public List<EmployeeResponseDTO> getEmpByEmpAgeLessThanEqual(@PathVariable String empAge){
        var result = employeeService.getByEmpAgeLessThanEqual(empAge);
        //return EmployeeMapper.dtoMapper(result);
        return result.stream().map(EmployeeMapper::dtoMapper).toList();
    }

    /*
     *Param empAge
     *This method is used to get List of Employees Those age are greater than given age
     */
    @GetMapping("/getEmpByEmpAge/greaterThan/{empAge}")
    public List<EmployeeResponseDTO> getEmpByEmpAgeGreaterThan(@PathVariable String empAge){
        var result = employeeService.getByEmpAgeGreaterThan(empAge);
        //return EmployeeMapper.dtoMapper(result);
        return result.stream().map(EmployeeMapper::dtoMapper).toList();
    }

    /*
     *Param empAge
     *This method is used to get List of Employees Those age are greater than equal given age
     */
    @GetMapping("/getEmpByEmpAge/greaterThanEqual/{empAge}")
    public List<EmployeeResponseDTO> getEmpByEmpAgeGreaterThanEqual(@PathVariable String empAge){
        var result = employeeService.getByEmpAgeGreaterThanEqual(empAge);
        return result.stream().map(EmployeeMapper::dtoMapper).toList();
    }

    /*
     *
     *This method is used to get List of Employees Those age are not filled at registration time
     * (findByAge(Is)Null)
     */
    @GetMapping("/getEmpByEmpAge/isnullAge/{empAge}")
    public List<EmployeeResponseDTO> getEmpByEmpAgeNotFilled(){
        var result = employeeService.getByEmpAgeIsNull();
        return result.stream().map(EmployeeMapper::dtoMapper).toList();
    }

    /*
     *This method is used to get List of Employees Those age are not null(findByAge(Is)NotNull)
     */
    @GetMapping("/getEmpByEmpAge/allAge/{empAge}")
    public List<EmployeeResponseDTO> getEmpByAllEmpAgeList(){
        var result = employeeService.getByEmpAgeIsNull();
        return result.stream().map(EmployeeMapper::dtoMapper).toList();
    }

    /*
     *Param inputString
     *This method is used to get List of Employees by FirstName (Like '%a%)'
     */
    @GetMapping("/getEmpByFirstName/checkByLike/{inputString}")
    public List<EmployeeResponseDTO> getEmpByFirstNameCheckByLike(String inputString){
        var result = employeeService.getByEmpFirstNameLike("%" + inputString + "%");
        return result.stream().map(EmployeeMapper::dtoMapper).toList();
    }

    /*
     *Param inputString
     *This method is used to get List of Employees by FirstName (Not Like '%a%)'
     */
    @GetMapping("/getEmpByFirstName/checkByNotLike/{inputString}")
    public List<EmployeeResponseDTO> getEmpByFirstNameCheckByNotLike(String inputString){
        var result = employeeService.getByEmpFirstNameNotLike("%" + inputString + "%");
        return result.stream().map(EmployeeMapper::dtoMapper).toList();
    }

    /*
     *Param prefix
     *This method is used to get List of Employees by FirstName (starting with prefix)'
     */
    @GetMapping("/getEmpByFirstName/startWith/{prefix}")
    public List<EmployeeResponseDTO> getEmpByFirstNameStartWith(String prefix){
        var result = employeeService.getByEmpFirstNameStartingWith(prefix);
        return result.stream().map(EmployeeMapper::dtoMapper).toList();
    }

    /*
     *Param postfix
     *This method is used to get List of Employees by FirstName (ending with postfix)'
     */
    @GetMapping("/getEmpByFirstName/endWith/{postfix}")
    public List<EmployeeResponseDTO> getEmpByFirstNameEndWith(String postfix){
        var result = employeeService.getByEmpFirstNameEndingWith(postfix);
        return result.stream().map(EmployeeMapper::dtoMapper).toList();
    }

    /*
     *Param substring
     *This method is used to get List of Employees by FirstName (containing subString)
     */
    @GetMapping("/getEmpByFirstName/subString/{subString}")
    public List<EmployeeResponseDTO> getEmpByFirstNameContains(String subString){
        var result = employeeService.getByEmpFirstNameContaining(subString);
        return result.stream().map(EmployeeMapper::dtoMapper).toList();
    }

    /*
     *Param empAge
     *This method is used to get List of Employees search by empAge order by empFirstName (List is
     * order by empFirstName)
     */
    @GetMapping("/getEmpByEmpAgeOderByFirstName/{empAge}")
    public List<EmployeeResponseDTO> getEmpByEmpAgeOderByFirstName(String empAge){
        var result = employeeService.getByEmpAgeOrderByEmpLastNameDesc(empAge);
        return result.stream().map(EmployeeMapper::dtoMapper).toList();
    }


}
