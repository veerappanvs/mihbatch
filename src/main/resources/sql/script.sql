USE [MIH]
GO
/****** Object:  Table [dbo].[tbl_Ambulance]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_Ambulance]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_Ambulance](
	[Ambulance_Id] [int] IDENTITY(1,1) NOT NULL,
	[Ambulance_Local_Jurisdiction] [varchar](50) NULL,
	[Ambulance_License_Number] [varchar](50) NULL,
	[Ambulance_Service_Name] [varchar](100) NULL,
	[Ambulance_Contact_Person] [varchar](50) NULL,
	[Ambulance_Person_Title] [varchar](50) NULL,
	[Ambulance_Contact_Number] [varchar](12) NULL,
	[Ambulance_Email_Id] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[Ambulance_Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[student]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[student]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[student](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](50) NULL,
	[gender] [varchar](50) NULL,
	[age] [int] NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[book_category]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[book_category]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[book_category](
	[id] [int] NOT NULL,
	[name] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[applications]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[applications]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[applications](
	[application_id] [int] IDENTITY(1,1) NOT NULL,
	[aff_health_care_org] [varchar](255) NULL,
	[application_type] [varchar](255) NULL,
	[rowcreateddate] [datetime2](7) NULL,
	[file_submission_date] [datetime2](7) NULL,
	[form_type] [varchar](255) NULL,
	[rowupdateddate] [datetime2](7) NULL,
	[no_of_emt] [int] NULL,
	[no_of_ems] [int] NULL,
	[overall_workflow_status] [varchar](255) NULL,
	[proposed_program_start_date] [datetime2](7) NULL,
	[date_of_submission] [datetime2](7) NULL,
	[unique_id] [varchar](255) NULL,
	[updatedby] [varchar](255) NULL,
	[workflow_completed_date] [datetime2](7) NULL,
	[workflow_start_date] [datetime2](7) NULL,
	[contact_person_id] [int] NULL,
	[org_id] [int] NULL,
	[primary_medical_director_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[application_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tbl_Section_Details]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_Section_Details]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_Section_Details](
	[Section_Id] [int] IDENTITY(1,1) NOT NULL,
	[Form_Type] [varchar](50) NULL,
	[Section_Number] [varchar](10) NULL,
	[Sub_Section_Number] [varchar](10) NULL,
	[Brief_Description] [varchar](100) NULL,
	[Text_Type] [varchar](20) NULL,
 CONSTRAINT [PK__tbl_sect__3B326FD7CED85A98] PRIMARY KEY CLUSTERED 
(
	[Section_Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tbl_Roles]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_Roles]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_Roles](
	[Role_Id] [int] IDENTITY(1,1) NOT NULL,
	[Role_Name] [varchar](50) NULL,
	[Role_Desc] [varchar](100) NULL,
	[Status] [varchar](5) NULL,
	[Role_Seq] [int] NULL,
 CONSTRAINT [PK__tbl_Role__D80AB4BB59B85FCD] PRIMARY KEY CLUSTERED 
(
	[Role_Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tbl_Program_Fund]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_Program_Fund]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_Program_Fund](
	[Program_Fund_Id] [int] IDENTITY(1,1) NOT NULL,
	[Program_Fund_Name] [varchar](100) NULL,
 CONSTRAINT [PK__tbl_Prog__8BD5350F08F083C9] PRIMARY KEY CLUSTERED 
(
	[Program_Fund_Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tbl_Person]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_Person]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_Person](
	[Person_Id] [int] IDENTITY(1,1) NOT NULL,
	[Person_Name] [varchar](100) NULL,
	[Title] [varchar](10) NULL,
	[Email_Id] [varchar](50) NULL,
	[Person_Type] [varchar](10) NULL,
	[Phone_Number] [varchar](14) NULL,
 CONSTRAINT [PK__tbl_Pers__7EABD0AB3B1605D5] PRIMARY KEY CLUSTERED 
(
	[Person_Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tbl_Organization]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_Organization]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_Organization](
	[Org_Id] [int] IDENTITY(1,1) NOT NULL,
	[Org_Name] [varchar](200) NULL,
	[Org_Address_Line1] [varchar](50) NULL,
	[Org_Address_Line2] [varchar](50) NULL,
	[City] [varchar](50) NULL,
	[State] [varchar](5) NULL,
	[Zipcode] [varchar](5) NULL,
 CONSTRAINT [PK__tbl_Orga__EF71F381F5FC154B] PRIMARY KEY CLUSTERED 
(
	[Org_Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tbl_File]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_File]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_File](
	[File_Id] [int] IDENTITY(1,1) NOT NULL,
	[Application_Id] [varchar](10) NULL,
	[Unique_Id] [varchar](10) NULL,
	[File_Name] [varchar](100) NULL,
	[Created_by] [varchar](10) NULL,
	[Created_time] [datetime] NULL,
	[Upload_Status] [varchar](50) NULL,
	[Upload_Comments] [varchar](10) NULL,
 CONSTRAINT [PK_tbl_File] PRIMARY KEY CLUSTERED 
(
	[File_Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tbl_CH_Improvement]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_CH_Improvement]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_CH_Improvement](
	[Improvement_Id] [int] IDENTITY(1,1) NOT NULL,
	[Improvement] [varchar](2000) NULL,
	[Improvement_Seq] [int] NULL,
	[Form_Type] [varchar](5) NULL,
 CONSTRAINT [PK__tbl_CH_I__7E7549DDEEDE5DC4] PRIMARY KEY CLUSTERED 
(
	[Improvement_Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tbl_Attachment]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_Attachment]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_Attachment](
	[Attachment_Id] [int] IDENTITY(1,1) NOT NULL,
	[Form_Type] [varchar](5) NULL,
	[Attachment_Name] [varchar](50) NULL,
	[Attachment_Description] [varchar](100) NULL,
	[Attachment_Type] [varchar](10) NULL,
 CONSTRAINT [PK__tbl_Atta__97E3B2DF89D6BAB8] PRIMARY KEY CLUSTERED 
(
	[Attachment_Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tbl_Applications]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_Applications]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_Applications](
	[Application_Id] [int] IDENTITY(1,1) NOT NULL,
	[Unique_Id] [varchar](20) NULL,
	[Org_Id] [int] NULL,
	[Date_Of_Submission] [datetime] NULL,
	[Contact_Person_Id] [int] NULL,
	[Primary_Medical_Director_Id] [int] NULL,
	[Proposed_Program_Start_date] [datetime] NULL,
	[No_of_EMS] [int] NULL,
	[No_of_EMT] [int] NULL,
	[Aff_Health_Care_Org] [varchar](50) NULL,
	[Form_Type] [varchar](5) NULL,
	[Application_Type] [varchar](10) NULL,
	[RowcreatedDate] [datetime] NULL,
	[RowupdatedDate] [datetime] NULL,
	[Updatedby] [varchar](100) NULL,
	[File_Submission_Date] [datetime] NULL,
	[Workflow_Completed_Date] [datetime] NULL,
	[Overall_Workflow_Status] [varchar](10) NOT NULL,
	[Workflow_Start_Date] [datetime] NOT NULL,
 CONSTRAINT [PK__tbl_Appl__E063E1EB15673276] PRIMARY KEY CLUSTERED 
(
	[Application_Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tbl_PersonRoles]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_PersonRoles]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_PersonRoles](
	[Role_Id] [int] NULL,
	[Person_Id] [int] NULL
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[tbl_Workflow_Details]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_Workflow_Details]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_Workflow_Details](
	[Workflow_Id] [int] IDENTITY(1,1) NOT NULL,
	[Application_Id] [int] NULL,
	[Role_Id] [int] NULL,
	[Role_Name] [varchar](50) NULL,
	[Status] [varchar](50) NULL,
	[Action_Taken_By] [int] NULL,
	[Start_Date] [datetime] NULL,
	[Completed_Date] [datetime] NULL,
 CONSTRAINT [tbl_Workflow_Details_pK ] PRIMARY KEY CLUSTERED 
(
	[Workflow_Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tbl_Proposed_Operational_Partners]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_Proposed_Operational_Partners]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_Proposed_Operational_Partners](
	[Application_Id] [int] NULL,
	[Partner_Id] [int] NULL,
	[Partner_Name] [varchar](200) NULL,
	[Contact] [varchar](200) NULL,
	[Partner_Seq] [int] NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tbl_App_Signatory]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_App_Signatory]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_App_Signatory](
	[Application_Id] [int] NOT NULL,
	[Section_Id] [int] NULL,
	[Person_Id] [int] NULL,
	[Date_of_Signature] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[Application_Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[tbl_App_Program_Fund]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_App_Program_Fund]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_App_Program_Fund](
	[Application_Id] [int] NULL,
	[Program_Fund_Id] [int] NULL,
	[Description] [varchar](500) NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tbl_App_Free_Text_Details]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_App_Free_Text_Details]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_App_Free_Text_Details](
	[Application_Id] [int] NULL,
	[Section_Id] [int] NULL,
	[Free_Text] [varchar](2000) NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tbl_App_CH_Improvement]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_App_CH_Improvement]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_App_CH_Improvement](
	[Application_Id] [int] NULL,
	[Improvement_Id] [int] NULL,
	[Proposed_Services] [varchar](1000) NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tbl_App_Attachment]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_App_Attachment]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_App_Attachment](
	[Attachment_Id] [int] NULL,
	[Application_Id] [int] NULL
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[tbl_App_Ambulance]    Script Date: 06/02/2017 15:56:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tbl_App_Ambulance]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[tbl_App_Ambulance](
	[Application_Id] [int] NULL,
	[Ambulance_Id] [int] NULL
) ON [PRIMARY]
END
GO
/****** Object:  ForeignKey [FK_tbl_App_Ambulance_tbl_Ambulance]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Ambulance_tbl_Ambulance]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Ambulance]'))
ALTER TABLE [dbo].[tbl_App_Ambulance]  WITH CHECK ADD  CONSTRAINT [FK_tbl_App_Ambulance_tbl_Ambulance] FOREIGN KEY([Ambulance_Id])
REFERENCES [dbo].[tbl_Ambulance] ([Ambulance_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Ambulance_tbl_Ambulance]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Ambulance]'))
ALTER TABLE [dbo].[tbl_App_Ambulance] CHECK CONSTRAINT [FK_tbl_App_Ambulance_tbl_Ambulance]
GO
/****** Object:  ForeignKey [FK_tbl_App_Ambulance_tbl_Applications]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Ambulance_tbl_Applications]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Ambulance]'))
ALTER TABLE [dbo].[tbl_App_Ambulance]  WITH CHECK ADD  CONSTRAINT [FK_tbl_App_Ambulance_tbl_Applications] FOREIGN KEY([Application_Id])
REFERENCES [dbo].[tbl_Applications] ([Application_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Ambulance_tbl_Applications]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Ambulance]'))
ALTER TABLE [dbo].[tbl_App_Ambulance] CHECK CONSTRAINT [FK_tbl_App_Ambulance_tbl_Applications]
GO
/****** Object:  ForeignKey [FK_tbl_App_Attachment_tbl_Applications]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Attachment_tbl_Applications]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Attachment]'))
ALTER TABLE [dbo].[tbl_App_Attachment]  WITH CHECK ADD  CONSTRAINT [FK_tbl_App_Attachment_tbl_Applications] FOREIGN KEY([Application_Id])
REFERENCES [dbo].[tbl_Applications] ([Application_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Attachment_tbl_Applications]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Attachment]'))
ALTER TABLE [dbo].[tbl_App_Attachment] CHECK CONSTRAINT [FK_tbl_App_Attachment_tbl_Applications]
GO
/****** Object:  ForeignKey [FK_tbl_App_Attachment_tbl_Attachment]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Attachment_tbl_Attachment]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Attachment]'))
ALTER TABLE [dbo].[tbl_App_Attachment]  WITH CHECK ADD  CONSTRAINT [FK_tbl_App_Attachment_tbl_Attachment] FOREIGN KEY([Attachment_Id])
REFERENCES [dbo].[tbl_Attachment] ([Attachment_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Attachment_tbl_Attachment]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Attachment]'))
ALTER TABLE [dbo].[tbl_App_Attachment] CHECK CONSTRAINT [FK_tbl_App_Attachment_tbl_Attachment]
GO
/****** Object:  ForeignKey [FK_tbl_App_CH_Improvement_tbl_Applications]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_CH_Improvement_tbl_Applications]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_CH_Improvement]'))
ALTER TABLE [dbo].[tbl_App_CH_Improvement]  WITH CHECK ADD  CONSTRAINT [FK_tbl_App_CH_Improvement_tbl_Applications] FOREIGN KEY([Application_Id])
REFERENCES [dbo].[tbl_Applications] ([Application_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_CH_Improvement_tbl_Applications]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_CH_Improvement]'))
ALTER TABLE [dbo].[tbl_App_CH_Improvement] CHECK CONSTRAINT [FK_tbl_App_CH_Improvement_tbl_Applications]
GO
/****** Object:  ForeignKey [FK_tbl_App_CH_Improvement_tbl_CH_Improvement]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_CH_Improvement_tbl_CH_Improvement]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_CH_Improvement]'))
ALTER TABLE [dbo].[tbl_App_CH_Improvement]  WITH CHECK ADD  CONSTRAINT [FK_tbl_App_CH_Improvement_tbl_CH_Improvement] FOREIGN KEY([Improvement_Id])
REFERENCES [dbo].[tbl_CH_Improvement] ([Improvement_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_CH_Improvement_tbl_CH_Improvement]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_CH_Improvement]'))
ALTER TABLE [dbo].[tbl_App_CH_Improvement] CHECK CONSTRAINT [FK_tbl_App_CH_Improvement_tbl_CH_Improvement]
GO
/****** Object:  ForeignKey [FK_tbl_App_Free_Text_Details_tbl_Applications]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Free_Text_Details_tbl_Applications]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Free_Text_Details]'))
ALTER TABLE [dbo].[tbl_App_Free_Text_Details]  WITH CHECK ADD  CONSTRAINT [FK_tbl_App_Free_Text_Details_tbl_Applications] FOREIGN KEY([Application_Id])
REFERENCES [dbo].[tbl_Applications] ([Application_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Free_Text_Details_tbl_Applications]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Free_Text_Details]'))
ALTER TABLE [dbo].[tbl_App_Free_Text_Details] CHECK CONSTRAINT [FK_tbl_App_Free_Text_Details_tbl_Applications]
GO
/****** Object:  ForeignKey [FK_tbl_App_Free_Text_Details_tbl_Section_Details]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Free_Text_Details_tbl_Section_Details]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Free_Text_Details]'))
ALTER TABLE [dbo].[tbl_App_Free_Text_Details]  WITH CHECK ADD  CONSTRAINT [FK_tbl_App_Free_Text_Details_tbl_Section_Details] FOREIGN KEY([Section_Id])
REFERENCES [dbo].[tbl_Section_Details] ([Section_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Free_Text_Details_tbl_Section_Details]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Free_Text_Details]'))
ALTER TABLE [dbo].[tbl_App_Free_Text_Details] CHECK CONSTRAINT [FK_tbl_App_Free_Text_Details_tbl_Section_Details]
GO
/****** Object:  ForeignKey [FK_tbl_App_Program_Fund_tbl_Applications]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Program_Fund_tbl_Applications]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Program_Fund]'))
ALTER TABLE [dbo].[tbl_App_Program_Fund]  WITH CHECK ADD  CONSTRAINT [FK_tbl_App_Program_Fund_tbl_Applications] FOREIGN KEY([Application_Id])
REFERENCES [dbo].[tbl_Applications] ([Application_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Program_Fund_tbl_Applications]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Program_Fund]'))
ALTER TABLE [dbo].[tbl_App_Program_Fund] CHECK CONSTRAINT [FK_tbl_App_Program_Fund_tbl_Applications]
GO
/****** Object:  ForeignKey [FK_tbl_App_Program_Fund_tbl_Program_Fund]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Program_Fund_tbl_Program_Fund]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Program_Fund]'))
ALTER TABLE [dbo].[tbl_App_Program_Fund]  WITH CHECK ADD  CONSTRAINT [FK_tbl_App_Program_Fund_tbl_Program_Fund] FOREIGN KEY([Program_Fund_Id])
REFERENCES [dbo].[tbl_Program_Fund] ([Program_Fund_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Program_Fund_tbl_Program_Fund]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Program_Fund]'))
ALTER TABLE [dbo].[tbl_App_Program_Fund] CHECK CONSTRAINT [FK_tbl_App_Program_Fund_tbl_Program_Fund]
GO
/****** Object:  ForeignKey [FK_tbl_App_Signatory_tbl_Applications]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Signatory_tbl_Applications]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Signatory]'))
ALTER TABLE [dbo].[tbl_App_Signatory]  WITH CHECK ADD  CONSTRAINT [FK_tbl_App_Signatory_tbl_Applications] FOREIGN KEY([Application_Id])
REFERENCES [dbo].[tbl_Applications] ([Application_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Signatory_tbl_Applications]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Signatory]'))
ALTER TABLE [dbo].[tbl_App_Signatory] CHECK CONSTRAINT [FK_tbl_App_Signatory_tbl_Applications]
GO
/****** Object:  ForeignKey [FK_tbl_App_Signatory_tbl_Section_Details]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Signatory_tbl_Section_Details]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Signatory]'))
ALTER TABLE [dbo].[tbl_App_Signatory]  WITH CHECK ADD  CONSTRAINT [FK_tbl_App_Signatory_tbl_Section_Details] FOREIGN KEY([Section_Id])
REFERENCES [dbo].[tbl_Section_Details] ([Section_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_App_Signatory_tbl_Section_Details]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_App_Signatory]'))
ALTER TABLE [dbo].[tbl_App_Signatory] CHECK CONSTRAINT [FK_tbl_App_Signatory_tbl_Section_Details]
GO
/****** Object:  ForeignKey [FK_tbl_Applications_tbl_Organization]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_Applications_tbl_Organization]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_Applications]'))
ALTER TABLE [dbo].[tbl_Applications]  WITH NOCHECK ADD  CONSTRAINT [FK_tbl_Applications_tbl_Organization] FOREIGN KEY([Org_Id])
REFERENCES [dbo].[tbl_Organization] ([Org_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_Applications_tbl_Organization]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_Applications]'))
ALTER TABLE [dbo].[tbl_Applications] CHECK CONSTRAINT [FK_tbl_Applications_tbl_Organization]
GO
/****** Object:  ForeignKey [FK_tbl_Applications_tbl_Person]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_Applications_tbl_Person]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_Applications]'))
ALTER TABLE [dbo].[tbl_Applications]  WITH NOCHECK ADD  CONSTRAINT [FK_tbl_Applications_tbl_Person] FOREIGN KEY([Contact_Person_Id])
REFERENCES [dbo].[tbl_Person] ([Person_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_Applications_tbl_Person]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_Applications]'))
ALTER TABLE [dbo].[tbl_Applications] CHECK CONSTRAINT [FK_tbl_Applications_tbl_Person]
GO
/****** Object:  ForeignKey [FK_tbl_Applications_tbl_Person1]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_Applications_tbl_Person1]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_Applications]'))
ALTER TABLE [dbo].[tbl_Applications]  WITH NOCHECK ADD  CONSTRAINT [FK_tbl_Applications_tbl_Person1] FOREIGN KEY([Primary_Medical_Director_Id])
REFERENCES [dbo].[tbl_Person] ([Person_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_Applications_tbl_Person1]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_Applications]'))
ALTER TABLE [dbo].[tbl_Applications] CHECK CONSTRAINT [FK_tbl_Applications_tbl_Person1]
GO
/****** Object:  ForeignKey [FK_tbl_PersonRoles_tbl_Person]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_PersonRoles_tbl_Person]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_PersonRoles]'))
ALTER TABLE [dbo].[tbl_PersonRoles]  WITH CHECK ADD  CONSTRAINT [FK_tbl_PersonRoles_tbl_Person] FOREIGN KEY([Person_Id])
REFERENCES [dbo].[tbl_Person] ([Person_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_PersonRoles_tbl_Person]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_PersonRoles]'))
ALTER TABLE [dbo].[tbl_PersonRoles] CHECK CONSTRAINT [FK_tbl_PersonRoles_tbl_Person]
GO
/****** Object:  ForeignKey [FK_tbl_PersonRoles_tbl_Roles]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_PersonRoles_tbl_Roles]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_PersonRoles]'))
ALTER TABLE [dbo].[tbl_PersonRoles]  WITH CHECK ADD  CONSTRAINT [FK_tbl_PersonRoles_tbl_Roles] FOREIGN KEY([Role_Id])
REFERENCES [dbo].[tbl_Roles] ([Role_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_PersonRoles_tbl_Roles]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_PersonRoles]'))
ALTER TABLE [dbo].[tbl_PersonRoles] CHECK CONSTRAINT [FK_tbl_PersonRoles_tbl_Roles]
GO
/****** Object:  ForeignKey [FK_tbl_Proposed_Operational_Partners_tbl_Applications]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_Proposed_Operational_Partners_tbl_Applications]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_Proposed_Operational_Partners]'))
ALTER TABLE [dbo].[tbl_Proposed_Operational_Partners]  WITH CHECK ADD  CONSTRAINT [FK_tbl_Proposed_Operational_Partners_tbl_Applications] FOREIGN KEY([Application_Id])
REFERENCES [dbo].[tbl_Applications] ([Application_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_tbl_Proposed_Operational_Partners_tbl_Applications]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_Proposed_Operational_Partners]'))
ALTER TABLE [dbo].[tbl_Proposed_Operational_Partners] CHECK CONSTRAINT [FK_tbl_Proposed_Operational_Partners_tbl_Applications]
GO
/****** Object:  ForeignKey [tbl_Workflow_Details_tbl_Applications]    Script Date: 06/02/2017 15:56:45 ******/
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[tbl_Workflow_Details_tbl_Applications]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_Workflow_Details]'))
ALTER TABLE [dbo].[tbl_Workflow_Details]  WITH NOCHECK ADD  CONSTRAINT [tbl_Workflow_Details_tbl_Applications] FOREIGN KEY([Application_Id])
REFERENCES [dbo].[tbl_Applications] ([Application_Id])
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[tbl_Workflow_Details_tbl_Applications]') AND parent_object_id = OBJECT_ID(N'[dbo].[tbl_Workflow_Details]'))
ALTER TABLE [dbo].[tbl_Workflow_Details] CHECK CONSTRAINT [tbl_Workflow_Details_tbl_Applications]
GO
