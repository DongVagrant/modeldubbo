package com.wd.modeldubboclient.agent;

import com.wd.modeldubboclient.dto.StudentDto;
import com.wd.modeldubboclient.dto.common.Result;

public interface ITestQueryAgent {

    Result<StudentDto> queryTestStudents(Integer id);
}
