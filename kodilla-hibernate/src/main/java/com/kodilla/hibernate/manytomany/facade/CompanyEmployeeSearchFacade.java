package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyEmployeeSearchFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyEmployeeSearchFacade.class);

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    public List<Employee> emplyeeSearch(final String characters) throws CompanyEmployeeSearchException {
        boolean wasError = false;
        List<Employee> employeeList;
        String wordToFind = "%" + characters + "%";
        try {
            LOGGER.info("Searching employee by phrase: " + characters);
            employeeList = employeeDao.searchByPartOfName(wordToFind);
            if (employeeList.size() == 0) {
                wasError = true;
                LOGGER.error(CompanyEmployeeSearchException.ERR_NO_EMPLOYEE_FOUND);
                throw new CompanyEmployeeSearchException(CompanyEmployeeSearchException.ERR_NO_EMPLOYEE_FOUND);
            }else {
                employeeList.forEach(employee -> LOGGER.info("Employee : " + employee));
                return employeeList;
            }
        } finally {
            if (wasError) {
                LOGGER.error(CompanyEmployeeSearchException.ERR_SEARCH_FINISHED);
            }else {
                LOGGER.info(CompanyEmployeeSearchException.INFO_SEARCH_FINISHED);
            }
        }
    }

    public List<Company> searchCompany(final String characters) throws CompanyEmployeeSearchException {
    boolean wasError = false;
    List<Company> companyList;
    String wordToFind = "%" + characters + "%";
        try {
            LOGGER.info("Searching company by phrase: " + characters);
            companyList = companyDao.searchByPartOfName(wordToFind);
            if (companyList.size() == 0) {
                wasError = true;
                LOGGER.error(CompanyEmployeeSearchException.ERR_NO_COMPANY_FOUND);
                throw new CompanyEmployeeSearchException(CompanyEmployeeSearchException.ERR_NO_COMPANY_FOUND);
            }else {
                companyList.forEach(company -> LOGGER.info("Company name: " + company));
                return companyList;
            }
        } finally {
            if (wasError) {
                LOGGER.error(CompanyEmployeeSearchException.ERR_SEARCH_FINISHED);
            }else {
                LOGGER.info(CompanyEmployeeSearchException.INFO_SEARCH_FINISHED);
            }
        }
    }
}

