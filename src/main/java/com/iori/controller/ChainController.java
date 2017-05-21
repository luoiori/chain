package com.iori.controller;

import com.iori.entity.Chain;
import com.iori.mapper.ChainMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.List;

/**
 * Created by iori on 17/5/21.
 */
@Controller
@RequestMapping(value = "/chain")
public class ChainController {
    @Autowired
    private ChainMapper chainMapper;

    @RequestMapping(value = "{loginName}",method = RequestMethod.GET)
    public String post(@PathVariable("loginName") String loginName, HttpServletResponse response, HttpServletRequest request){
        String masterId = chainMapper.getMasterId(loginName);
        if(StringUtils.isNotBlank(masterId)){
            List<Chain> sheet1 = chainMapper.get1(masterId);
            List<Chain> sheet2 = chainMapper.get2(masterId);
            List<Chain> sheet3 = chainMapper.get3(masterId);
            List<Chain> sheet4 = chainMapper.get4(masterId);
            List<Chain> sheet5 = chainMapper.get5(masterId);

            InputStream is = ChainController.class.getClassLoader().getResourceAsStream("excel/chain.xlsx");
            XSSFWorkbook workbook = exportChain(is, sheet1,sheet2,sheet3,sheet4,sheet5);
            // 往客户端传送文件流
            response.setContentType("application/x-msdownload");
            try {
                response.setHeader("Content-Disposition",
                        "attachment;filename=" + new String(URLDecoder.decode("连锁店信息.xlsx", "UTF-8").getBytes(), "iso-8859-1"));
                // 最终写入文件
                workbook.write(response.getOutputStream());
                response.getOutputStream().flush();
                response.getOutputStream().close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            try {
                response.getWriter().print("没找到连锁店信息");
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }


    public XSSFWorkbook exportChain(InputStream in, List<Chain> sheet1List, List<Chain> sheet2List, List<Chain> sheet3List, List<Chain> sheet4List, List<Chain> sheet5List) {
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(in);
            // 1
            XSSFSheet sheet1 = workbook.getSheetAt(1);

            if (sheet1List != null && sheet1List.size() > 0) {

                int bodyRowIndex = 1;
                for (Chain chain : sheet1List) {
                    int bodyColumbIndex = 0;
                    XSSFRow row = sheet1.createRow(bodyRowIndex++);
                    Cell cell = null;
                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA1());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA2());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA3());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA4());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA5());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA6());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA7());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA8());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA9());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA10());

                }
            }


            // 2
            XSSFSheet sheet2 = workbook.getSheetAt(2);

            if (sheet2List != null && sheet2List.size() > 0) {

                int bodyRowIndex = 1;
                for (Chain chain : sheet2List) {
                    int bodyColumbIndex = 0;
                    XSSFRow row = sheet2.createRow(bodyRowIndex++);
                    Cell cell = null;
                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA1());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA2());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA3());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA4());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA5());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA6());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA7());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA8());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA9());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA10());

                }
            }

            // 3
            XSSFSheet sheet3 = workbook.getSheetAt(3);

            if (sheet3List != null && sheet3List.size() > 0) {

                int bodyRowIndex = 1;
                for (Chain chain : sheet3List) {
                    int bodyColumbIndex = 0;
                    XSSFRow row = sheet3.createRow(bodyRowIndex++);
                    Cell cell = null;
                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA1());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA2());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA3());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA4());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA5());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA6());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA7());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA8());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA9());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA10());

                }
            }

            // 4
            XSSFSheet sheet4 = workbook.getSheetAt(4);

            if (sheet4List != null && sheet4List.size() > 0) {

                int bodyRowIndex = 1;
                for (Chain chain : sheet4List) {
                    int bodyColumbIndex = 0;
                    XSSFRow row = sheet4.createRow(bodyRowIndex++);
                    Cell cell = null;
                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA1());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA2());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA3());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA4());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA5());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA6());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA7());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA8());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA9());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA10());

                }
            }

            // 5
            XSSFSheet sheet5 = workbook.getSheetAt(5);

            if (sheet5List != null && sheet5List.size() > 0) {

                int bodyRowIndex = 1;
                for (Chain chain : sheet5List) {
                    int bodyColumbIndex = 0;
                    XSSFRow row = sheet5.createRow(bodyRowIndex++);
                    Cell cell = null;
                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA1());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA2());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA3());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA4());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA5());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA6());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA7());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA8());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA9());

                    cell = row.createCell(bodyColumbIndex++);
                    cell.setCellValue(chain.getA10());

                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

        return workbook;
    }

}
