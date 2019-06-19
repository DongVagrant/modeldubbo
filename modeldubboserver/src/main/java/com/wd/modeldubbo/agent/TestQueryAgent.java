package com.wd.modeldubbo.agent;

import com.wd.modeldubboclient.agent.ITestQueryAgent;
import com.wd.modeldubboclient.dto.StudentDto;
import com.wd.modeldubboclient.dto.common.ErrorCode;
import com.wd.modeldubboclient.dto.common.Result;

public class TestQueryAgent implements ITestQueryAgent {
    @Override
    public Result<StudentDto> queryTestStudents(Integer id) {

        if (id == null){
            return new Result<>(ErrorCode.MY_ERROR);
        }
        StudentDto studentDto = new StudentDto();
        studentDto.setId(1111111);
        studentDto.setName("小明");
        studentDto.setGrade(2);
        return new Result<>(studentDto);
    }
}
