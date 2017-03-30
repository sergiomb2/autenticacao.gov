/* soapWSHttpBinding_USCORECCMovelSignatureProxy.h
   Generated by gSOAP 2.8.30 for CCMovelSignature.h

gSOAP XML Web services tools
Copyright (C) 2000-2016, Robert van Engelen, Genivia Inc. All Rights Reserved.
The soapcpp2 tool and its generated software are released under the GPL.
This program is released under the GPL with the additional exemption that
compiling, linking, and/or using OpenSSL is allowed.
--------------------------------------------------------------------------------
A commercial use license is available from Genivia Inc., contact@genivia.com
--------------------------------------------------------------------------------
*/

#ifndef soapWSHttpBinding_USCORECCMovelSignatureProxy_H
#define soapWSHttpBinding_USCORECCMovelSignatureProxy_H
#include "soapH.h"

    class SOAP_CMAC WSHttpBinding_USCORECCMovelSignatureProxy {
      public:
        /// Context to manage proxy IO and data
        struct soap *soap;
        bool soap_own; ///< flag indicating that this context is owned by this proxy when context is shared
        /// Endpoint URL of service 'WSHttpBinding_USCORECCMovelSignatureProxy' (change as needed)
        const char *soap_endpoint;
        /// Variables globally declared in CCMovelSignature.h, if any
        /// Construct a proxy with new managing context
        WSHttpBinding_USCORECCMovelSignatureProxy();
        /// Copy constructor
        WSHttpBinding_USCORECCMovelSignatureProxy(const WSHttpBinding_USCORECCMovelSignatureProxy& rhs);
        /// Construct proxy given a shared managing context
        WSHttpBinding_USCORECCMovelSignatureProxy(struct soap*);
        /// Constructor taking an endpoint URL
        WSHttpBinding_USCORECCMovelSignatureProxy(const char *endpoint);
        /// Constructor taking input and output mode flags for the new managing context
        WSHttpBinding_USCORECCMovelSignatureProxy(soap_mode iomode);
        /// Constructor taking endpoint URL and input and output mode flags for the new managing context
        WSHttpBinding_USCORECCMovelSignatureProxy(const char *endpoint, soap_mode iomode);
        /// Constructor taking input and output mode flags for the new managing context
        WSHttpBinding_USCORECCMovelSignatureProxy(soap_mode imode, soap_mode omode);
        /// Destructor deletes non-shared managing context only (use destroy() to delete deserialized data)
        virtual ~WSHttpBinding_USCORECCMovelSignatureProxy();
        /// Initializer used by constructors
        virtual void WSHttpBinding_USCORECCMovelSignatureProxy_init(soap_mode imode, soap_mode omode);
        /// Return a copy that has a new managing context with the same engine state
        virtual WSHttpBinding_USCORECCMovelSignatureProxy *copy() SOAP_PURE_VIRTUAL;
        /// Copy assignment
        WSHttpBinding_USCORECCMovelSignatureProxy& operator=(const WSHttpBinding_USCORECCMovelSignatureProxy&);
        /// Delete all deserialized data (uses soap_destroy() and soap_end())
        virtual void destroy();
        /// Delete all deserialized data and reset to default
        virtual void reset();
        /// Disables and removes SOAP Header from message by setting soap->header = NULL
        virtual void soap_noheader();
        /// Add SOAP Header to message
        virtual void soap_header(char *wsa__MessageID, struct wsa__Relationship *wsa__RelatesTo, struct wsa__EndpointReferenceType *wsa__From, struct wsa__EndpointReferenceType *wsa__ReplyTo, struct wsa__EndpointReferenceType *wsa__FaultTo, char *wsa__To, char *wsa__Action, struct _wsse__Security *wsse__Security);
        /// Get SOAP Header structure (i.e. soap->header, which is NULL when absent)
        virtual ::SOAP_ENV__Header *soap_header();
        /// Get SOAP Fault structure (i.e. soap->fault, which is NULL when absent)
        virtual ::SOAP_ENV__Fault *soap_fault();
        /// Get SOAP Fault string (NULL when absent)
        virtual const char *soap_fault_string();
        /// Get SOAP Fault detail as string (NULL when absent)
        virtual const char *soap_fault_detail();
        /// Close connection (normally automatic, except for send_X ops)
        virtual int soap_close_socket();
        /// Force close connection (can kill a thread blocked on IO)
        virtual int soap_force_close_socket();
        /// Print fault
        virtual void soap_print_fault(FILE*);
    #ifndef WITH_LEAN
    #ifndef WITH_COMPAT
        /// Print fault to stream
        virtual void soap_stream_fault(std::ostream&);
    #endif
        /// Write fault to buffer
        virtual char *soap_sprint_fault(char *buf, size_t len);
    #endif
        /// Web service operation 'CCMovelSign' (returns SOAP_OK or error code)
        virtual int CCMovelSign(_ns2__CCMovelSign *ns2__CCMovelSign, _ns2__CCMovelSignResponse &ns2__CCMovelSignResponse)
        { return this->CCMovelSign(NULL, NULL, ns2__CCMovelSign, ns2__CCMovelSignResponse); }
        virtual int CCMovelSign(const char *soap_endpoint, const char *soap_action, _ns2__CCMovelSign *ns2__CCMovelSign, _ns2__CCMovelSignResponse &ns2__CCMovelSignResponse);
        /// Web service operation 'CCMovelValidateSignature' (returns SOAP_OK or error code)
        virtual int CCMovelValidateSignature(_ns2__CCMovelValidateSignature *ns2__CCMovelValidateSignature, _ns2__CCMovelValidateSignatureResponse &ns2__CCMovelValidateSignatureResponse)
        { return this->CCMovelValidateSignature(NULL, NULL, ns2__CCMovelValidateSignature, ns2__CCMovelValidateSignatureResponse); }
        virtual int CCMovelValidateSignature(const char *soap_endpoint, const char *soap_action, _ns2__CCMovelValidateSignature *ns2__CCMovelValidateSignature, _ns2__CCMovelValidateSignatureResponse &ns2__CCMovelValidateSignatureResponse);
        /// Web service operation 'GetCertificate' (returns SOAP_OK or error code)
        virtual int GetCertificate(_ns2__GetCertificate *ns2__GetCertificate, _ns2__GetCertificateResponse &ns2__GetCertificateResponse)
        { return this->GetCertificate(NULL, NULL, ns2__GetCertificate, ns2__GetCertificateResponse); }
        virtual int GetCertificate(const char *soap_endpoint, const char *soap_action, _ns2__GetCertificate *ns2__GetCertificate, _ns2__GetCertificateResponse &ns2__GetCertificateResponse);
        /// Web service operation 'ValidateOtp' (returns SOAP_OK or error code)
        virtual int ValidateOtp(_ns2__ValidateOtp *ns2__ValidateOtp, _ns2__ValidateOtpResponse &ns2__ValidateOtpResponse)
        { return this->ValidateOtp(NULL, NULL, ns2__ValidateOtp, ns2__ValidateOtpResponse); }
        virtual int ValidateOtp(const char *soap_endpoint, const char *soap_action, _ns2__ValidateOtp *ns2__ValidateOtp, _ns2__ValidateOtpResponse &ns2__ValidateOtpResponse);
    };
#endif
