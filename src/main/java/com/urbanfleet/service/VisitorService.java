package com.urbanfleet.service;

import com.urbanfleet.dto.VisitorRequest;
import com.urbanfleet.dto.VisitorResponse;
import com.urbanfleet.model.Visitor;

public interface VisitorService
{
    String SaveVisitor(VisitorRequest visitorRequest);

    VisitorResponse getByvRNum(String vRnum);
}
