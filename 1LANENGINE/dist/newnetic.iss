; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

[Setup]
; NOTE: The value of AppId uniquely identifies this application.
; Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{73A00EE1-7461-4177-B312-DD20D2DDBCFC}
AppName=EXAM PORTAL
AppVersion=1.0
;AppVerName=EXAM PORTAL 1.0
AppPublisher=NewNetic
DefaultDirName={pf}\EXAM PORTAL
DisableProgramGroupPage=yes
OutputDir=C:\Users\Hp\Documents\NetBeansProjects\1LANENGINE\dist
OutputBaseFilename=setup
SetupIconFile=C:\Users\Hp\Downloads\Umut-Pulat-Tulliana-2-Korganizer.ico
Compression=lzma
SolidCompression=yes

[Languages]
Name: "english"; MessagesFile: "compiler:Default.isl"

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked

[Files]
Source: "C:\Program Files (x86)\Inno Setup 5\Examples\MyProg.exe"; DestDir: "{app}"; Flags: ignoreversion
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Icons]
Name: "{commonprograms}\EXAM PORTAL"; Filename: "{app}\MyProg.exe"
Name: "{commondesktop}\EXAM PORTAL"; Filename: "{app}\MyProg.exe"; Tasks: desktopicon

[Run]
Filename: "{app}\MyProg.exe"; Description: "{cm:LaunchProgram,EXAM PORTAL}"; Flags: nowait postinstall skipifsilent

