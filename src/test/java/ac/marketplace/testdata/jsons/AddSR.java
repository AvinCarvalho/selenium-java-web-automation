package ac.testingplace.testdata.jsons;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data

public class  AddRequest{
    public String RequestTitle;
    public String Role;

    public AddRequest(String RequestTitle, String role, String specialty, String RequestType, String RequestDescription, String facility, String department, String startDate, String noOfPositions, String hiringManager, String billRate, String shift, String shiftsPerWeek, String hoursPerShift, String shiftTimings, String timesheetApprovers) {
        RequestTitle = RequestTitle;
        Role = role;
        Specialty = specialty;
        RequestType = RequestType;
        RequestDescription = RequestDescription;
        Facility = facility;
        Department = department;
        StartDate = startDate;
        NoOfPositions = noOfPositions;
        HiringManager = hiringManager;
        BillRate = billRate;
        Shift = shift;
        ShiftsPerWeek = shiftsPerWeek;
        HoursPerShift = hoursPerShift;
        ShiftTimings = shiftTimings;
        TimesheetApprovers = timesheetApprovers;
    }

    public AddRequest(String RequestTitle) {
        RequestTitle = RequestTitle;
    }

    public String getRequestTitle() {
        return RequestTitle;
    }

    public void setRequestTitle(String RequestTitle) {
        RequestTitle = RequestTitle;
    }

    public String Specialty;
    public String RequestType;
    public String RequestDescription;
    public String Facility;

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String specialty) {
        Specialty = specialty;
    }

    public String getRequestType() {
        return RequestType;
    }

    public void setRequestType(String RequestType) {
        RequestType = RequestType;
    }

    public String getRequestDescription() {
        return RequestDescription;
    }

    public void setRequestDescription(String RequestDescription) {
        RequestDescription = RequestDescription;
    }

    public String getFacility() {
        return Facility;
    }

    public void setFacility(String facility) {
        Facility = facility;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getNoOfPositions() {
        return NoOfPositions;
    }

    public void setNoOfPositions(String noOfPositions) {
        NoOfPositions = noOfPositions;
    }

    public String getHiringManager() {
        return HiringManager;
    }

    public void setHiringManager(String hiringManager) {
        HiringManager = hiringManager;
    }

    public String getBillRate() {
        return BillRate;
    }

    public void setBillRate(String billRate) {
        BillRate = billRate;
    }

    public String getShift() {
        return Shift;
    }

    public void setShift(String shift) {
        Shift = shift;
    }

    public String getShiftsPerWeek() {
        return ShiftsPerWeek;
    }

    public void setShiftsPerWeek(String shiftsPerWeek) {
        ShiftsPerWeek = shiftsPerWeek;
    }

    public String getHoursPerShift() {
        return HoursPerShift;
    }

    public void setHoursPerShift(String hoursPerShift) {
        HoursPerShift = hoursPerShift;
    }

    public String getShiftTimings() {
        return ShiftTimings;
    }

    public void setShiftTimings(String shiftTimings) {
        ShiftTimings = shiftTimings;
    }

    public String getTimesheetApprovers() {
        return TimesheetApprovers;
    }

    public void setTimesheetApprovers(String timesheetApprovers) {
        TimesheetApprovers = timesheetApprovers;
    }

    public String Department;
    public String StartDate;
    public String NoOfPositions;
    public String HiringManager;
    public String BillRate;
    public String Shift;
    public String ShiftsPerWeek;
    public String HoursPerShift;
    public String ShiftTimings;
    public String TimesheetApprovers;

    @Override
    public String toString() {
        return toString();
    }
}