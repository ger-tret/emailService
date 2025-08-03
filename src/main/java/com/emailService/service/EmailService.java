package com.emailService.service;

import com.emailService.model.EmailModel;

public interface EmailService {
    EmailModel sendEmail(EmailModel emailModel);
}
