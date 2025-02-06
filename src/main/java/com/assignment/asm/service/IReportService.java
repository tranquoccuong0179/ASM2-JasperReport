package com.assignment.asm.service;

import com.assignment.asm.model.User;
import net.sf.jasperreports.engine.JRException;

import java.io.FileNotFoundException;
import java.util.List;

public interface IReportService {
    byte[] generatePdfListUser(List<User> products) throws JRException, FileNotFoundException;

    byte[] generateExcelListUser(List<User> users) throws JRException, FileNotFoundException;
}
